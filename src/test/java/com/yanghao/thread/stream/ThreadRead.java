package com.yanghao.thread.stream;

import java.io.PipedInputStream;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/8/16 10:04
 */
public class ThreadRead extends Thread{
    private ReadData readData;
    private PipedInputStream inputStream;

    public ThreadRead(ReadData readData, PipedInputStream inputStream) {
        this.readData = readData;
        this.inputStream = inputStream;
    }

    @Override
    public void run(){
        readData.readMethod(inputStream);
    }
}
