package com.yanghao.design.structuralMode.FilterPattern.impl;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/7/23 14:49
 */

import com.yanghao.design.structuralMode.FilterPattern.Criteria;
import com.yanghao.design.structuralMode.FilterPattern.Person;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){//筛选单身
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}