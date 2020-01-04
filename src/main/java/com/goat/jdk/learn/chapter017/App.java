package com.goat.jdk.learn.chapter017;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;


public class App {

    private static final Logger log = LoggerFactory.getLogger(App.class);

    private static final String ip = "127.0.0.1";
    private static final Integer port = 5002;

    @Test
    public void test() throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getByName(ip);
        log.info(inetAddress.getHostName());
        log.info(inetAddress.getHostAddress());
    }

    @Test
    public void test1() {
        InetSocketAddress inetSocketAddress = new InetSocketAddress(ip,port);
        log.info("",inetSocketAddress.getAddress());
        log.info(inetSocketAddress.getHostName());
        log.info("",inetSocketAddress.getPort());
    }


}
