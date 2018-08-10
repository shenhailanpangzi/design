package com.yanghao.design.desogn.behavioralModel.StatePattern;

import lombok.Data;

/**
 * @Description：
 * 步骤 3
 * 创建 Context 类。
 * @Author:yanghao
 * @Date：2018/7/24 14:47
 */
@Data
public class Context {
    private State state;

    public Context(){
        state = null;
    }
}