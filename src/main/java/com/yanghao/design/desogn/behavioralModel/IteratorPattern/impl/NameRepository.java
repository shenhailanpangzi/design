package com.yanghao.design.desogn.behavioralModel.IteratorPattern.impl;

import com.yanghao.design.desogn.behavioralModel.IteratorPattern.Container;
import com.yanghao.design.desogn.behavioralModel.IteratorPattern.Iterator;

/**
 * @Description：
 * 步骤 2
 * 创建实现了 Container 接口的实体类。该类有实现了 Iterator 接口的内部类 NameIterator。
 * @Author:yanghao
 * @Date：2018/7/24 14:05
 */
public class NameRepository implements Container {
    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if(index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}