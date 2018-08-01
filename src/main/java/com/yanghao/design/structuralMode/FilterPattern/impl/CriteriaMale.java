package com.yanghao.design.structuralMode.FilterPattern.impl;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/7/23 14:46
 */

import com.yanghao.design.structuralMode.FilterPattern.Criteria;
import com.yanghao.design.structuralMode.FilterPattern.Person;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("MALE")){//筛选男
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}