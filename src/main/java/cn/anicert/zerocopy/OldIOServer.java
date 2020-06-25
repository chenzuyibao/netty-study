package cn.anicert.zerocopy;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author chenzuyi
 * @create 2020-06-25 22:19
 */
public class OldIOServer {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(8899);

        while (true) {
            Socket socket = serverSocket.accept();
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

            try {
                byte[] byteArray = new byte[4096];

                while (true) {

                    int read = dataInputStream.read(byteArray, 0, byteArray.length);

                    if (read == -1) {
                        break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
