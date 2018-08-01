package com.yanghao.design.behavioralModel.TemplatePattern;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/7/24 15:40
 */
public class Football extends Game {

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}