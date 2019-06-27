package com.qf.service;

import com.qf.entity.Student;

import java.util.List;

/**
 * @version 1.0
 * @user ken
 * @date 2019/6/26 15:02
 */
public interface IStuService {

    List<Student> queryAll();

    int insertStu(Student student);

    int deleteStu(Integer sid);
}
