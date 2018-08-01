package com.yanghao.design.structuralMode.AdapterPattern;

/**
 * @Description：高级媒体播放器
 *  * 步骤 1
 *  * 为媒体播放器和更高级的媒体播放器创建接口。
 * @Author:yanghao
 * @Date：2018/7/23 14:17
 */
public interface AdvancedMediaPlayer {
    public void playVlc(String fileName);
    public void playMp4(String fileName);
}