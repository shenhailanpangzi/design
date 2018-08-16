package com.yanghao.thread.stream;

import java.io.PipedOutputStream;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/8/16 10:04
 */
public class ThreadWrite extends Thread{
    private WriteData writeData;
    private PipedOutputStream outputStream;

    public ThreadWrite(WriteData writeData, PipedOutputStream outputStream) {
        this.writeData = writeData;
        this.outputStream = outputStream;
    }
    @Override
    public void run(){
            writeData.writeMethod(outputStream);
    }
}
