package com.qf.service.impl;

import com.qf.dao.StuMapper;
import com.qf.entity.Classes;
import com.qf.entity.Student;
import com.qf.service.IClassesService;
import com.qf.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0
 * @user ken
 * @date 2019/6/26 15:03
 */
@Service
public class StuServiceImpl implements IStuService {

    @Autowired
    private StuMapper stuMapper;

    @Autowired
    private IClassesService classesService;

    @Override
    public List<Student> queryAll() {
        List<Student> students = stuMapper.selectList(null);

        for (Student student : students) {
            Classes classes = classesService.queryById(student.getCid());
            student.setClasses(classes);
        }
        return students;
    }

    @Override
    public int insertStu(Student student) {
        return stuMapper.insert(student);
    }

    @Override
    public int deleteStu(Integer sid) {
        return stuMapper.deleteById(sid);
    }
}
