package cn.anicert.zerocopy;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.FileChannel;
import java.nio.channels.SocketChannel;

/**
 * @author chenzuyi
 * @create 2020-06-25 23:31
 */
public class NewIOClient {

    public static void main(String[] args) throws IOException {

        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.connect(new InetSocketAddress("localhost", 8899));
        socketChannel.configureBlocking(true);

        FileChannel channel = new FileInputStream("D:\\Java\\jdk-8u171-linux-x64.rpm").getChannel();

        long startTime = System.currentTimeMillis();

        long transferCount = channel.transferTo(0, channel.size(), socketChannel);

        System.out.println("大小：" + transferCount + " , 耗时：" + (System.currentTimeMillis() - startTime));

        channel.close();
        socketChannel.close();

    }

}
