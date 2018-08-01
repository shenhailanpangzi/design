package com.yanghao.design.J2EEModel.CompositeEntityPattern;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/7/24 16:48
 */
public class Client {
    private CompositeEntity compositeEntity = new CompositeEntity();

    public void printData(){
        for (int i = 0; i < compositeEntity.getData().length; i++) {
            System.out.println("Data: " + compositeEntity.getData()[i]);
        }
    }

    public void setData(String data1, String data2){
        compositeEntity.setData(data1, data2);
    }
}