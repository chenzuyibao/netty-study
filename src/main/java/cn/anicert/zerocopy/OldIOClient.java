package cn.anicert.zerocopy;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.net.Socket;

/**
 * @author chenzuyi
 * @create 2020-06-25 22:33
 */
public class OldIOClient {

    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("localhost", 8899);

        FileInputStream inputStream = new FileInputStream("D:\\Java\\jdk-8u171-linux-x64.rpm");

        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

        byte[] buffer = new byte[4096];
        long read = 0;
        long total = 0;

        long startTime = System.currentTimeMillis();

        while ((read = inputStream.read(buffer)) >= 0) {
            total += read;
            dataOutputStream.write(buffer);
        }
        System.out.println("大小：" + total + " , 耗时：" + (System.currentTimeMillis() - startTime));
        dataOutputStream.close();
        socket.close();
        inputStream.close();

    }

}
