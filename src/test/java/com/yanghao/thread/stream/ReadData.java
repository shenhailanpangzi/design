package com.yanghao.thread.stream;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * @Description：
 * 此处字节流（PipedInputStream） 也可以换成字符流（PipedReader）
 * @Author:yanghao
 * @Date：2018/8/16 9:57
 */
public class ReadData {
    public void readMethod(PipedInputStream pipedInputStream){
        try {
            System.out.println("Read  :");
            byte[] bytes = new byte[20];
            int readLength = pipedInputStream.read(bytes);
            System.out.println("readLength:"+readLength);
            while (readLength != -1){
//                bytes为要解译的字符串；
//                offset为要解译的第一个索引，比如从0开始就是从字符串bytes的第一个字符开始；
//                length为要解译的字符串bytes的长度
                String newData = new String(bytes,0,readLength);
                System.out.println(newData);
                readLength = pipedInputStream.read(bytes);
                System.out.println("readLength:"+readLength);
            }
            System.out.println();
            pipedInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
