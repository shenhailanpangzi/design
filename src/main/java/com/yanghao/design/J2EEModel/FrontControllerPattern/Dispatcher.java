package com.yanghao.design.J2EEModel.FrontControllerPattern;

import com.yanghao.design.J2EEModel.FrontControllerPattern.view.HomeView;
import com.yanghao.design.J2EEModel.FrontControllerPattern.view.StudentView;

/**
 * @Description：
 * 步骤 2
 * 创建调度器 Dispatcher
 * @Author:yanghao
 * @Date：2018/7/24 16:58
 */
public class Dispatcher {
    private StudentView studentView;
    private HomeView homeView;
    public Dispatcher(){
        studentView = new StudentView();
        homeView = new HomeView();
    }

    public void dispatch(String request){
        if(request.equalsIgnoreCase("STUDENT")){
            studentView.show();
        }else{
            homeView.show();
        }
    }
}