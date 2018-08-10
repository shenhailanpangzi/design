package com.yanghao.thread.BasicsDemo;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description：
 * ConcurrentHashMap的并发度是什么
 * ConcurrentHashMap的并发度就是segment的大小，默认为16，这意味着最多同时可以有16条线程操作ConcurrentHashMap，
 * 这也是ConcurrentHashMap对Hashtable的最大优势，任何情况下，Hashtable能同时有两条线程获取Hashtable中的数据吗？
 * @Author:yanghao
 * @Date：2018/8/10 14:09
 */
public class MapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();


    }
}
