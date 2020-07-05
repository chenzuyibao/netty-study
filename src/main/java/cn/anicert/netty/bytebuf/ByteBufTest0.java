package cn.anicert.netty.bytebuf;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

/**
 * @author chenzuyi
 * @create 2020-07-05 13:37
 */
public class ByteBufTest0 {

    public static void main(String[] args) {
        ByteBuf buffer = Unpooled.buffer(10);

        for (int i = 0; i < 10; i++) {
            buffer.writeByte(i);
        }

        /**
         * 注意：通过索引来访问ByteBuf时并不会改变真实的读锁引和写索引；我们可以通过ByteBuf的readerIndex()和writeIndex()直接修改读写索引。
         */
        for (int i = 0; i < buffer.capacity(); i++) {
            System.out.println(buffer.getByte(i));
        }

        while (buffer.isReadable()) {
            System.out.println(buffer.readByte());
        }

    }

}
