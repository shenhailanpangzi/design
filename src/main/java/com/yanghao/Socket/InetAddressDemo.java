package com.yanghao.Socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Description：InetAddress类用于标识网络上的硬件资源，标识互联网协议(IP)地址。
 * @Author:yanghao
 * @Date：2018/7/30 17:17
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        //获取本机的InetAddress实例
        InetAddress address =InetAddress.getLocalHost();
        address.getHostName();//获取计算机名
        address.getHostAddress();//获取IP地址
        byte[] bytes = address.getAddress();//获取字节数组形式的IP地址,以点分隔的四部分
        //获取其他主机的InetAddress实例
        InetAddress address2 =InetAddress.getByName("其他主机名");
        InetAddress address3 =InetAddress.getByName("IP地址");
    }
}
