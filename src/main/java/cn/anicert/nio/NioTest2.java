package cn.anicert.nio;

import java.nio.IntBuffer;
import java.security.SecureRandom;

/**
 * @author chenzuyi
 * @create 2019-12-16 16:14
 */
public class NioTest2 {

    public static void main(String[] args) {

        IntBuffer buffer = IntBuffer.allocate(20);

        for (int i = 0; i < 5; i++) {
            buffer.put(new SecureRandom().nextInt(20));
        }

        System.out.println("before flip limit:" + buffer.limit());

        buffer.flip();

        System.out.println("after flip limit:" + buffer.limit());

        System.out.println("enter while loop");

        while (buffer.hasRemaining()) {
            System.out.println("position:" + buffer.position());
            System.out.println("limit:" + buffer.limit());
            System.out.println("capacity:" + buffer.capacity());

            System.out.println(buffer.get());

        }

    }
}
