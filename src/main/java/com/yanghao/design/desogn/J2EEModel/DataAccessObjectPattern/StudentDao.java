package com.yanghao.design.desogn.J2EEModel.DataAccessObjectPattern;

import java.util.List;

/**
 * @Description：
 * 步骤 2
 * 创建数据访问对象接口。
 * @Author:yanghao
 * @Date：2018/7/24 16:50
 */

public interface StudentDao {
    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}
