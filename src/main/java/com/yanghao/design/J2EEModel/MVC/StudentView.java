package com.yanghao.design.J2EEModel.MVC;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/7/24 16:05
 */
public class StudentView {
    public void printStudentDetails(String studentName, String studentRollNo){
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }
}