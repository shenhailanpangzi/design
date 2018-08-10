package com.yanghao.design.desogn.createdMode.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description：膳食
 * 步骤 5
 * 创建一个 Meal 类，带有上面定义的 Item 对象。
 * @Author:yanghao
 * @Date：2018/7/23 10:57
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item : items) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
