package cn.anicert.netty.sixth;

import java.util.Random;

import cn.anicert.netty.sixth.MyMessageData.MyMessage;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class TestClientHandler extends SimpleChannelInboundHandler<MyMessageData.MyMessage> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MyMessage msg) throws Exception {

    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {

        int random = new Random().nextInt(3);
        MyMessageData.MyMessage myMessage = null;
        // 通过产生一个随机数，来确定使用哪种随机数
        /**
         * 其实大家可能觉得这样的if else很麻烦，跟之前的学的springmvc啊之类的框架完全不一样， 比如：Reuqestmapping，直接路径映射，就能找到对应的Controller方法。
         * 但是别忘了，它DispatcherServlet，他帮助springmvc做了if else 判断，才能正确 的找到是哪个方法。 netty因为是底层框架，所以没有跟他们一样，这些if else 需要自己写.
         */
        if (0 == random) {
            // 使用枚举类型来构造一个对象
            myMessage = MyMessageData.MyMessage.newBuilder().setDataType(MyMessageData.MyMessage.DataType.PersonType)
                .setPerson(MyMessageData.Person.newBuilder().setName("张三").setId(11).setAddress("北京").build()).build();
        } else if (1 == random) {
            myMessage = MyMessageData.MyMessage.newBuilder().setDataType(MyMessageData.MyMessage.DataType.DogType)
                .setDog(MyMessageData.Dog.newBuilder().setName("小狗狗").setAge(8).build()).build();
        } else {
            myMessage = MyMessageData.MyMessage.newBuilder().setDataType(MyMessageData.MyMessage.DataType.CatType)
                .setCat(MyMessageData.Cat.newBuilder().setName("小猫咪").setAge(7).build()).build();
        }

        /**
         * 使用这种单一类型太耦合了，这也是RPC的通病，传输的数据类型必须是双方已知确定的。 这才会导致这种只能传递单一类型。这里，使用枚举类型很好的解决这个问题。 MyDataInfo.Student
         * student=MyDataInfo.Student.newBuilder(). setName("王五").setId(22).setAddress("永乐").build();
         */
        ctx.channel().writeAndFlush(myMessage);
    }

}
