package com.yanghao.design.desogn.structuralMode.AdapterPattern;

/**
 * @Description：媒体播放器
 * 步骤 1
 * 为媒体播放器和更高级的媒体播放器创建接口。
 * @Author:yanghao
 * @Date：2018/7/23 14:17
 */
public interface MediaPlayer {
    public void play(String audioType, String fileName);
}