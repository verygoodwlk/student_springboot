package com.qf.service.impl;

import com.qf.dao.ClassMapper;
import com.qf.entity.Classes;
import com.qf.service.IClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0
 * @user ken
 * @date 2019/6/26 15:04
 */
@Service
public class ClassesServiceImpl implements IClassesService {

    @Autowired
    private ClassMapper classMapper;

    @Override
    public Classes queryById(Integer cid) {
        return classMapper.selectById(cid);
    }

    @Override
    public List<Classes> queryAll() {
        return classMapper.selectList(null);
    }
}
