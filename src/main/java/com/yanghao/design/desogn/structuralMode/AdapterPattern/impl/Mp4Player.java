package com.yanghao.design.desogn.structuralMode.AdapterPattern.impl;

import com.yanghao.design.desogn.structuralMode.AdapterPattern.AdvancedMediaPlayer;

/**
 * @Description：
 *  * 步骤 2
 *  * 创建实现了 AdvancedMediaPlayer 接口的实体类。
 * @Author:yanghao
 * @Date：2018/7/23 14:19
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}