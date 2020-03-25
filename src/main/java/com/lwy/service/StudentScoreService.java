package com.lwy.service;

import com.lwy.pojo.Student;

import java.util.List;

public interface StudentScoreService {

    public String findByname(String name);
    public void insert(Student student);
    public List<Student> findAll(String key,String value);
    public void delete(String key,String value);
    public void update(String key,String value);
}
