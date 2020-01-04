package com.goat.jdk.learn.chapter017.demo1;

import com.goat.jdk.learn.chapter017.App;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 演示 socket 双向通讯
*/
public class App2 {

    private static final Logger log = LoggerFactory.getLogger(App.class);

    private static final String ip = "127.0.0.1";

    @Test
    public void client() throws IOException {
        InetAddress inetAddress = InetAddress.getByName(ip);
        Socket socket = new Socket(inetAddress, 8888);
        OutputStream os = socket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(os);
        dataOutputStream.writeUTF("山羊");

        socket.shutdownOutput();
        InputStream inputStream = socket.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        String s = dataInputStream.readUTF();
        log.info("客户端接收到服务器信息："+ s);

        dataInputStream.close();
        inputStream.close();

        dataOutputStream.close();
        os.close();
        socket.close();
    }

    @Test
    public void server() throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        DataInputStream dataOutputStream = new DataInputStream(inputStream);
        String s = dataOutputStream.readUTF();
        log.info("服务器接收到客户端消息："+ s);

        socket.shutdownInput();
        OutputStream os = socket.getOutputStream();
        DataOutputStream temp = new DataOutputStream(os);
        temp.writeUTF("服务器已经收到！");
        temp.close();
        dataOutputStream.close();
        inputStream.close();
        serverSocket.close();
    }


}
