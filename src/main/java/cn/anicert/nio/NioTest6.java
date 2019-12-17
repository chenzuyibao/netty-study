package cn.anicert.nio;

import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 内存映射文件：MappedByteBuffer
 * @author chenzuyi
 * @create 2019-12-17 15:10
 */
public class NioTest6 {

    public static void main(String[] args) throws Exception {

        RandomAccessFile randomAccessFile = new RandomAccessFile("F:\\input.txt", "rw");
        FileChannel fileChannel = randomAccessFile.getChannel();

        MappedByteBuffer mappedByteBuffer = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, 4);

        mappedByteBuffer.put(0, (byte) 'a');
        mappedByteBuffer.put(2, (byte) 'b');

        randomAccessFile.close();

    }

}
