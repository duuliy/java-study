package test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class network {
    public static void main(String[] args) throws UnknownHostException {

        InetAddress localHost =InetAddress.getLocalHost();
        String hostAddress=localHost.getHostAddress();
        String hostName=localHost.getHostName();
        System.out.println("本机地址"+hostAddress);
        System.out.println("主机名"+hostName);

//        InetAddress txIp=InetAddress.getByName()

    }
}


/**
 * getLocalHost 返回在本地主机
 *
 * getByName 获取远程ip
 * */


/**
 * udp通讯
 *
 * */

/**
 * TCP通讯
 *
 * */