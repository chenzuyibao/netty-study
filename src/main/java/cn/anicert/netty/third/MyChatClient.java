package cn.anicert.netty.third;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

public class MyChatClient {

    public static void main(String[] args) throws Exception {

        EventLoopGroup eventLoopGroup = new NioEventLoopGroup();

        try {
            Bootstrap boostrap = new Bootstrap();
            boostrap.group(eventLoopGroup).channel(NioSocketChannel.class).handler(new MyChatClientInitializer());
            /**
             * 这里和之前例子不一样，他获得的是一个Channel 表示和服务器端连接
             */
            Channel channel = boostrap.connect("localhost", 8899).sync().channel();

            BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));

            for (;;) {
                channel.writeAndFlush(bufferReader.readLine() + "\r\n");
            }

        } finally {
            eventLoopGroup.shutdownGracefully();
        }

    }

}
