package com.yanghao.design.structuralMode.AdapterPattern.impl;

import com.yanghao.design.structuralMode.AdapterPattern.AdvancedMediaPlayer;
import com.yanghao.design.structuralMode.AdapterPattern.MediaPlayer;

/**
 * @Description：
 * 步骤 3
 * 创建实现了 MediaPlayer 接口的适配器类。
 * @Author:yanghao
 * @Date：2018/7/23 14:20
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}