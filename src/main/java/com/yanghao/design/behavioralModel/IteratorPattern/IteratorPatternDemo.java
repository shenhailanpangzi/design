package com.yanghao.design.behavioralModel.IteratorPattern;

import com.yanghao.design.behavioralModel.IteratorPattern.impl.NameRepository;

/**
 * @Description：
 * 步骤 3
 * 使用 NameRepository 来获取迭代器，并打印名字
 * @Author:yanghao
 * @Date：2018/7/24 14:05
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}