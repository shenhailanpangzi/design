package com.yanghao.design.desogn.structuralMode.AdapterPattern.impl;

import com.yanghao.design.desogn.structuralMode.AdapterPattern.AdvancedMediaPlayer;

/**
 * @Description：Vlc播放器
 * 步骤 2
 * 创建实现了 AdvancedMediaPlayer 接口的实体类。
 * @Author:yanghao
 * @Date：2018/7/23 14:18
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
