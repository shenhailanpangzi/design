package com.yanghao.thread.stream;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/8/16 9:53
 */
public class WriteData {
    public void writeMethod(PipedOutputStream pipedOutputStream){
        try {
            System.out.println("Write:");
            for (int i = 0; i < 300; i++) {
                String outData = ""+(i+1);
//           getBytes  将一个String类型的字符串中包含的字符转换成byte类型并且存入一个byte[]数组中。在java中的所有数据底层都是字节，字节数据可以存入到byte数组。
                pipedOutputStream.write(outData.getBytes());
                System.out.println(outData);
            }
            System.out.println();
            pipedOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
