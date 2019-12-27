package com.goat.jdk.learn.chapter017;

import org.apache.log4j.Logger;
import org.junit.Test;
import java.net.*;


public class App {

    private static final Logger log = Logger.getLogger(App.class);

    private static final String ip = "127.0.0.1";
    private static final Integer port = 5002;

    @Test
    public void test() throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getByName(ip);
        log.info(inetAddress);
        log.info(inetAddress.getHostName());
        log.info(inetAddress.getHostAddress());
    }

    @Test
    public void test1() {
        InetSocketAddress inetSocketAddress = new InetSocketAddress(ip,port);
        log.info(inetSocketAddress.getAddress());
        log.info(inetSocketAddress.getHostName());
        log.info(inetSocketAddress.getPort());
    }


}
