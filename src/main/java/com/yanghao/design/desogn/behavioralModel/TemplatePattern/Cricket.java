package com.yanghao.design.desogn.behavioralModel.TemplatePattern;

/**
 * @Description：蟋蟀
 * @Author:yanghao
 * @Date：2018/7/24 15:40
 */
public class Cricket extends Game {

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}