package cn.anicert.netty.sixth;

import cn.anicert.netty.sixth.MyDataInfo.Person;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class TestServerHandler extends SimpleChannelInboundHandler<MyDataInfo.Person> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Person msg) throws Exception {
        System.out.println(msg.getName());
        System.out.println(msg.getId());
        System.out.println(msg.getAddress());
    }

}
