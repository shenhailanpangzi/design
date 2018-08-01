package com.yanghao.design.behavioralModel.TemplatePattern;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/7/24 15:40
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //模板
    public final void play(){

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }
}