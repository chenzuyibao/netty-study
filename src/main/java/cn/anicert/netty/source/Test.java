package cn.anicert.netty.source;

import io.netty.util.NettyRuntime;
import io.netty.util.internal.SystemPropertyUtil;

/**
 * @author chenzuyi
 * @create 2020-06-26 17:45
 */
public class Test {

    public static void main(String[] args) {
        int max = Math.max(1, SystemPropertyUtil.getInt(
                "io.netty.eventLoopThreads", NettyRuntime.availableProcessors() * 2));

        System.out.println(max);
    }

}
