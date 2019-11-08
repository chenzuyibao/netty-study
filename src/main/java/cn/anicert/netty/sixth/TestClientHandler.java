package cn.anicert.netty.sixth;

import cn.anicert.netty.sixth.MyDataInfo.Person;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class TestClientHandler extends SimpleChannelInboundHandler<MyDataInfo.Person> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Person msg) throws Exception {

    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        Person person = MyDataInfo.Person.newBuilder().setAddress("北京").setName("张三").setId(123).build();

        ctx.channel().writeAndFlush(person);
    }

}
