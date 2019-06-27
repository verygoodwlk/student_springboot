package com.qf.service;

import com.qf.entity.Classes;

import java.util.List;

public interface IClassesService {

    Classes queryById(Integer cid);

    List<Classes> queryAll();
}
