package cn.anicert.netty.sixth;

import cn.anicert.netty.sixth.MyMessageData.MyMessage;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class TestServerHandler extends SimpleChannelInboundHandler<MyMessageData.MyMessage> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MyMessage msg) throws Exception {

        MyMessageData.MyMessage.DataType dataType = msg.getDataType();

        if (dataType == MyMessageData.MyMessage.DataType.PersonType) {
            MyMessageData.Person person = msg.getPerson();
            System.out.println(person.getName());
            System.out.println(person.getId());
            System.out.println(person.getAddress());
        } else if (dataType == MyMessageData.MyMessage.DataType.DogType) {
            MyMessageData.Dog dog = msg.getDog();
            System.out.println(dog.getName());
            System.out.println(dog.getAge());
        } else {
            MyMessageData.Cat cat = msg.getCat();
            System.out.println(cat.getName());
            System.out.println(cat.getAge());
        }

    }

}
