package com.yanghao.design.desogn.structuralMode.ProxyPattern;

import com.yanghao.design.desogn.structuralMode.ProxyPattern.impl.ProxyImage;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/7/23 16:41
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        //图像将从磁盘加载
        image.display();
        System.out.println("");
        //图像将无法从磁盘加载
        image.display();
    }
}