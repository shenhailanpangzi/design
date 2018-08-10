package com.yanghao.design.desogn.structuralMode.FilterPattern;

/**
 * @Description：
 * 步骤 2
 * 为标准（Criteria）创建一个接口。
 * @Author:yanghao
 * @Date：2018/7/23 14:45
 */
import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}