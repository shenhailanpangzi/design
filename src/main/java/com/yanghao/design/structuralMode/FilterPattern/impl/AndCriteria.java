package com.yanghao.design.structuralMode.FilterPattern.impl;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/7/23 14:50
 */

import com.yanghao.design.structuralMode.FilterPattern.Criteria;
import com.yanghao.design.structuralMode.FilterPattern.Person;

import java.util.List;

public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
//        第一标准人
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}