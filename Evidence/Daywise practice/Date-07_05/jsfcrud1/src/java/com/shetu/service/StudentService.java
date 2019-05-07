/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shetu.service;

import com.shetu.entity.Student;
import java.util.List;

/**
 *
 * @author J2EE 37
 */
public interface StudentService {

    //all the methods
    void save(Student student);

    void update(Student student);

    void delete(Student student);

    List<Student> getStudent();
}
