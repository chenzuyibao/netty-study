package cn.anicert.nio;

import java.nio.ByteBuffer;

/**
 * 只读buffer,可以随时调用asReadOnlyBuffer方法将一个读写Buffer改写成只读buffer
 * 但不能将一个只读buffer转换为读写buffer
 *
 * @author chenzuyi
 * @create 2019-12-17 15:04
 */
public class NioTest5 {

    public static void main(String[] args) {

        ByteBuffer buffer = ByteBuffer.allocate(10);
        System.out.println(buffer.getClass());

        ByteBuffer readOnlyBuffer = buffer.asReadOnlyBuffer();
        System.out.println(readOnlyBuffer.getClass());

    }

}
