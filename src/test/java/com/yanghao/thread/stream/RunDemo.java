package com.yanghao.thread.stream;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @Description：通过管道流（PipedOutputStream）进行线程间通信
 * PipedOutputStream：在不同线程中直接传送数据，一个线程向管道输入数据，另一个线程从管道中读取数据
 *使用这种方法实现线程间通信，无需借助临时文件
 * @Author:yanghao
 * @Date：2018/8/16 13:56
 */
public class RunDemo {
    public static void main(String[] args) {
        try {
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();
            PipedInputStream pipedInputStream = new PipedInputStream();
            PipedOutputStream pipedOutputStream = new PipedOutputStream();
            //使两个Stream中产生通信链接 这样数据才能进行传输
            pipedInputStream.connect(pipedOutputStream);
//            pipedOutputStream.connect(pipedInputStream);

            ThreadRead threadRead = new ThreadRead(readData,pipedInputStream);
            threadRead.start();
            Thread.sleep(2000);

            ThreadWrite threadWrite = new ThreadWrite(writeData,pipedOutputStream);
            threadWrite.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
