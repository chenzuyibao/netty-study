package cn.anicert.nio;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author chenzuyi
 * @create 2019-12-05 15:10
 */
public class NioTest {

    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("F:\\nio.txt");
        FileChannel channel = fileInputStream.getChannel();

        ByteBuffer byteBuffer = ByteBuffer.allocate(50);
        channel.read(byteBuffer);

        byteBuffer.flip();

        while (byteBuffer.remaining() > 0) {
            System.out.println("Charactor:" + (char) byteBuffer.get());
        }

        fileInputStream.close();

    }

}
