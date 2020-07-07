package cn.anicert.netty.handler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * 这里的泛型是String，说明这个传输的是个String对象
 */
public class MyServerHandler extends SimpleChannelInboundHandler<Long> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Long msg) throws Exception {
        System.out.println(ctx.channel().remoteAddress() + " : " + msg);
        ctx.channel().writeAndFlush(654321L);
    }

    /**
     * 异常的捕获，一般出现异常，就把连接关闭
     */
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }

}
