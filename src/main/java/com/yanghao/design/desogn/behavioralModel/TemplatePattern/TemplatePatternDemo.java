package com.yanghao.design.desogn.behavioralModel.TemplatePattern;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/7/24 15:41
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}