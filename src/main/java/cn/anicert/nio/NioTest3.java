package cn.anicert.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author chenzuyi
 * @create 2019-12-16 16:54
 */
public class NioTest3 {

    public static void main(String[] args) throws Exception {

        FileInputStream fileInputStream = new FileInputStream("F:\\input.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("F:\\output.txt");

        FileChannel inputChannel = fileInputStream.getChannel();
        FileChannel outputChannel = fileOutputStream.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(1024);

        while (true) {
            //每次需要重新清除buffer，其实就是定义position和limit位置
            buffer.clear();

            int read = inputChannel.read(buffer);

            if (read == -1) {
                break;
            }

            buffer.flip();

            outputChannel.write(buffer);

        }

        inputChannel.close();
        outputChannel.close();

    }

}
