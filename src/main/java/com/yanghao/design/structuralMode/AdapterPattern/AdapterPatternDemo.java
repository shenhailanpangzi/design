package com.yanghao.design.structuralMode.AdapterPattern;

import com.yanghao.design.structuralMode.AdapterPattern.impl.AudioPlayer;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/7/23 14:24
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}