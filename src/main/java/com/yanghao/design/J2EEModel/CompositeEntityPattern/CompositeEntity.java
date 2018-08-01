package com.yanghao.design.J2EEModel.CompositeEntityPattern;

/**
 * @Description：
 * 步骤 3
 * 创建组合实体。
 * @Author:yanghao
 * @Date：2018/7/24 16:47
 */
public class CompositeEntity {
    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2){
        cgo.setData(data1, data2);
    }

    public String[] getData(){
        return cgo.getData();
    }
}