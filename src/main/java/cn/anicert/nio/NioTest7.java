package cn.anicert.nio;

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/**
 * @author chenzuyi
 * @create 2019-12-17 18:56
 */
public class NioTest7 {

    public static void main(String[] args) throws Exception {

        RandomAccessFile randomAccessFile = new RandomAccessFile("F:\\input.txt", "rw");

        FileChannel channel = randomAccessFile.getChannel();

        FileLock fileLock = channel.lock(3, 6, true);

        System.out.println("valid:" + fileLock.isValid());
        System.out.println("lock type:" + fileLock.isShared());

        fileLock.release();

        randomAccessFile.close();

    }

}
