package com.yanghao.design.structuralMode.FilterPattern;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Description：
 * 步骤 1
 * 创建一个类，在该类上应用标准。
 * @Author:yanghao
 * @Date：2018/7/23 14:44
 */
@Data
@AllArgsConstructor
public class Person {

    private String name;
    private String gender;
    private String maritalStatus;//婚姻状况
}
