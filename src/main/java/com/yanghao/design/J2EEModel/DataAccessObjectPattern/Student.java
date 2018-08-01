package com.yanghao.design.J2EEModel.DataAccessObjectPattern;

/**
 * @Description：
 * 步骤 1
 * 创建数值对象。
 * @Author:yanghao
 * @Date：2018/7/24 16:50
 */
public class Student {
    private String name;
    private int rollNo;

    Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}