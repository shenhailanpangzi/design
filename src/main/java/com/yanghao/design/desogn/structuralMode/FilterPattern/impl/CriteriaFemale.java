package com.yanghao.design.desogn.structuralMode.FilterPattern.impl;

/**
 * @Description：
 * 步骤 3
 * 创建实现了 Criteria 接口的实体类。
 * @Author:yanghao
 * @Date：2018/7/23 14:47
 */

import com.yanghao.design.desogn.structuralMode.FilterPattern.Criteria;
import com.yanghao.design.desogn.structuralMode.FilterPattern.Person;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("FEMALE")){//筛选女
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
