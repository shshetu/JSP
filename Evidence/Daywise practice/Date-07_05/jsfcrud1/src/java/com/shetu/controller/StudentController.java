/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shetu.controller;

import com.shetu.entity.Student;
import com.shetu.implementation.StudentImplementation;
import com.shetu.service.StudentService;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author J2EE 37
 */
@ManagedBean
public class StudentController {

    //TOtal implementation of service is in StudentImplementation
    private Student student;
    private List<Student> students;
    private StudentService service;

    public void save() {
        service = new StudentImplementation();
        service.save(student);
        FacesContext.getCurrentInstance().addMessage("MessageId", new FacesMessage(FacesMessage.SEVERITY_INFO, "Save Successfull!", null));
        System.out.println("Saved successfully!");
    }

    public void update() {
        service = new StudentImplementation();
        service.update(student);
        FacesContext.getCurrentInstance().addMessage("MessageIdUp", new FacesMessage(FacesMessage.SEVERITY_INFO, "Update Successfull!", null));
        System.out.println("Update successfully!");
    }

    public void delete() {
        service = new StudentImplementation();
        service.delete(student);
        FacesContext.getCurrentInstance().addMessage("MessageIdUp", new FacesMessage(FacesMessage.SEVERITY_INFO, "Delete Succful!", null));
        System.out.println("Deleted Successfully!");
    }

    public Student getStudent() {
        if (student == null) {
            student = new Student();
        }
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Student> getStudents() {
        students = new ArrayList<>();
        service = new StudentImplementation();
        students = service.getStudent();
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

}
