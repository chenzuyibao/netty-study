package cn.anicert.netty.third;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

public class MyChatServerHandler extends SimpleChannelInboundHandler<String> {

    private static ChannelGroup channelGroup = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {
        Channel channel = ctx.channel();
        channelGroup.forEach(ch -> {
            if (channel != ch) {
                ch.writeAndFlush("[客户]" + channel.remoteAddress() + "发送了消息--" + msg + "\n");
            } else {
                ch.writeAndFlush("[自己]" + "发送了消息" + msg + "\n");
            }
        });
    }

    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        Channel channel = ctx.channel();
        /**
         * channelGroup的writeAndFlush有点特别，他将循环对里面每一个channel进行输出 如：假如A上线，会通知channelGroup其他channel，但是不会通知A，因为此时没有加入A
         * 如果也想通知自己，那么在输出前将自己加入channelGroup就好（注意他们的顺序）
         *
         */
        channelGroup.writeAndFlush("[客户端]-" + channel.remoteAddress() + "加入\n");
        channelGroup.add(channel);

    }

    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {

        Channel channel = ctx.channel();
        /**
         * 如果是离开，相对应的应该移除channel，但是这里不需要 因为netty，自动将它移除了
         */
        channelGroup.writeAndFlush("[客户端]-" + channel.remoteAddress() + "离开\n");

    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        Channel channel = ctx.channel();
        System.out.println(channel.remoteAddress() + "上线啦！！！！");
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        Channel channel = ctx.channel();
        System.out.println(channel.remoteAddress() + "离线啦！！！！");
    }
}
