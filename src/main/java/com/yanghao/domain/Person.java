package com.yanghao.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/7/10 10:03
 */
@Data
@AllArgsConstructor
public class Person {
    private String firstName;
    private String lastName;
    private int age;
}
