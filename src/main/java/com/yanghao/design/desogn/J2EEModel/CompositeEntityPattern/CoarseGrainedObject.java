package com.yanghao.design.desogn.J2EEModel.CompositeEntityPattern;

/**
 * @Description：
 * 步骤 2
 * 创建粗粒度对象。
 * @Author:yanghao
 * @Date：2018/7/24 16:47
 */
public class CoarseGrainedObject {
    DependentObject1 do1 = new DependentObject1();
    DependentObject2 do2 = new DependentObject2();

    public void setData(String data1, String data2){
        do1.setData(data1);
        do2.setData(data2);
    }

    public String[] getData(){
        return new String[] {do1.getData(),do2.getData()};
    }
}