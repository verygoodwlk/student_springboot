package com.qf.controller;

import com.qf.entity.Classes;
import com.qf.entity.Student;
import com.qf.service.IClassesService;
import com.qf.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @version 1.0
 * @user ken
 * @date 2019/6/26 15:01
 */
@Controller
@RequestMapping("/stu")
public class StuController {

    @Autowired
    private IStuService stuService;

    @Autowired
    private IClassesService classesService;

    @RequestMapping("/list")
    public String stuList(Model model){
        List<Student> students = stuService.queryAll();
        model.addAttribute("stus", students);
        return "stulist";
    }

    @RequestMapping("/toadd")
    public String toAdd(Model model){

        //查询所有班级
        List<Classes> classes = classesService.queryAll();
        model.addAttribute("classes", classes);

        return "stuadd";
    }

    @RequestMapping("/insert")
    public String insert(Student student){
        stuService.insertStu(student);
        return "redirect:/stu/list";
    }

    @RequestMapping("/delete")
    public String delete(int sid){
        stuService.deleteStu(sid);
        return "redirect:/stu/list";
    }

    @RequestMapping("/update")
    public String update(Student student){

        return null;
    }
}
