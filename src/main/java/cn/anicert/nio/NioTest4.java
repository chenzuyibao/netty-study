package cn.anicert.nio;

import java.nio.ByteBuffer;

/**
 * Slice Buffer，修改该buffer的值，原buffer也将改变。
 * 注意：Slice Buffer和原buffer其中position、limit等变量都是互相独立，互不影响的
 *
 * @author chenzuyi
 * @create 2019-12-17 9:09
 */
public class NioTest4 {

    public static void main(String[] args) {

        ByteBuffer buffer = ByteBuffer.allocate(10);

        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put((byte) i);
        }

        buffer.position(2);
        buffer.limit(6);

        ByteBuffer sliceBuffer = buffer.slice();

        for (int i = 0; i < sliceBuffer.capacity(); i++) {
            byte b = sliceBuffer.get();
            b *= 2;
            sliceBuffer.put(i, b);
        }

        buffer.position(0);
        buffer.limit(buffer.capacity());

        while (buffer.hasRemaining()) {
            System.out.println(buffer.get());
        }

    }

}
