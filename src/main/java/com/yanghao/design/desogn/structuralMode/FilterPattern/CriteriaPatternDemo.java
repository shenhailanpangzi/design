package com.yanghao.design.desogn.structuralMode.FilterPattern;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/7/23 14:54
 */

import com.yanghao.design.desogn.structuralMode.FilterPattern.impl.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CriteriaPatternDemo {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Robby","Male", "Single"));

        Criteria male = new CriteriaMale();//男性筛选
        Criteria female = new CriteriaFemale();//女性筛选
        Criteria single = new CriteriaSingle();//单身筛选
        Criteria singleMale = new AndCriteria(single, male);//组合筛选 单身男性
        Criteria singleOrFemale = new OrCriteria(single, female);//组合筛选 单身女性

        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.meetCriteria(persons));


    }

    public static void printPersons(List<Person> persons){
//        for (Person person : persons) {
//            System.out.println("Person : [ Name : " + person.getName()
//                    +", Gender : " + person.getGender()
//                    +", Marital Status : " + person.getMaritalStatus()
//                    +" ]");
//        }
       persons.forEach(person -> System.out.println("Person:[" +
               "name :"+person.getName() +
               ", Gender :"+person.getGender()+
               ", Marital Status : " + person.getMaritalStatus()+"]"));
    }
    //筛选名字由r开头的
    public static List<Person> filtername(List<Person> persons){
        List<Person> personList = persons.stream().filter(person -> person.getName().startsWith("R")).collect(Collectors.toList());
        return personList;
    }
}