package com.yanghao.Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/7/30 17:19
 */
public class URLDemo {
//1、URL(Uniform Resource Locator)统一资源定位符，表示Internet上某一资源的地址，协议名：资源名称
    public static void main(String[] args) throws MalformedURLException {
        //创建一个URL的实例
        URL baidu =new URL("http://www.baidu.com");
        URL url =new URL(baidu,"/index.html?username=tom#test");//？表示参数，#表示锚点
        System.out.println("Protocol:"+url.getProtocol());//获取协议
        System.out.println("Host:"+url.getHost());//获取主机
        System.out.println("Port:"+url.getPort());//如果没有指定端口号，根据协议不同使用默认端口。此时getPort()方法的返回值为 -1
        System.out.println("Path:"+url.getPath());//获取文件路径
        System.out.println("File:"+url.getFile());//文件名，包括文件路径+参数
        System.out.println("Ref:"+url.getRef());//相对路径，就是锚点，即#号后面的内容
        System.out.println("Query:"+url.getQuery());//查询字符串，即参数
    }
//2、使用URL读取网页内容
//    通过URL对象的openStream()方法可以得到指定资源的输入流，通过流能够读取或访问网页上的资源
    public static void main2(String[] args) throws IOException {
        //使用URL读取网页内容
        //创建一个URL实例
        URL url =new URL("http://www.baidu.com");
        InputStream is = url.openStream();//通过openStream方法获取资源的字节输入流
        InputStreamReader isr =new InputStreamReader(is,"UTF-8");//将字节输入流转换为字符输入流,如果不指定编码，中文可能会出现乱码
        BufferedReader br =new BufferedReader(isr);//为字符输入流添加缓冲，提高读取效率
        String data = br.readLine();//读取数据
        while(data!=null){
            System.out.println(data);//输出数据
            data = br.readLine();
        }
        System.out.println("data:"+data);
        br.close();
        isr.close();
        is.close();
    }
}
