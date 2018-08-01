package com.yanghao.design.behavioralModel.MediatorPattern;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description：
 * 步骤 1
 * 创建中介类。
 * @Author:yanghao
 * @Date：2018/7/24 14:16
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //定义要输出日期字符串的格式
        Date startTime = new Date();
        String startTimeSting = sdf.format(startTime);

        System.out.println(startTimeSting
                + " [" + user.getName() +"] : " + message);
    }
}