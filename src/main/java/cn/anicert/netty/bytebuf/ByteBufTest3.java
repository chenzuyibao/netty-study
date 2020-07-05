package cn.anicert.netty.bytebuf;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;

import java.util.Iterator;

/**
 * @author chenzuyi
 * @create 2020-07-05 16:50
 */
public class ByteBufTest3 {

    public static void main(String[] args) {
        CompositeByteBuf compositeByteBuf = Unpooled.compositeBuffer();

        ByteBuf heapBuffer = Unpooled.buffer(10);
        ByteBuf directBuffer = Unpooled.directBuffer(8);

        compositeByteBuf.addComponents(heapBuffer, directBuffer);
        //compositeByteBuf.removeComponent(0);

        Iterator<ByteBuf> iterator = compositeByteBuf.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }

}
