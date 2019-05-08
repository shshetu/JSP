/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shetu.controller;

import com.shetu.entity.Student;
import com.shetu.service.StudentService;
import com.shetu.serviceImplementation.ServiceImplementation;
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
    //We create object from the classes

    //create an object from entity class
    private Student student;

    //create an object from Service class
    private StudentService studentService;

    //create a List which will keep values from the StudentServiceimplementation
    private List<Student> students;

    ///create all 4 methods
    public void insert() {
        studentService = new ServiceImplementation();
//    new ServiceImplementation().insert(student);
        studentService.insert(student);
        //since we want to use the PrimeFace so we will use FaceContext
        FacesContext.getCurrentInstance().addMessage("Messageid", new FacesMessage(FacesMessage.SEVERITY_INFO, "Save Successful!", null));
        System.out.println("Saved Successful!");
    }

    public void update() {
        studentService = new ServiceImplementation();
        studentService.update(student);
        FacesContext.getCurrentInstance().addMessage("MessageIdUp", new FacesMessage(FacesMessage.SEVERITY_INFO, "Update Sucessful", null));
        System.out.println("Updated successfully!");
    }

    public void delete() {
        studentService = new ServiceImplementation();
        studentService.delete(student);
        FacesContext.getCurrentInstance().addMessage("MessageIdUp", new FacesMessage(FacesMessage.SEVERITY_INFO, "Delete Sucessful!", null));
        System.out.println("Deleted successfully");
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
        //student is a list type data which is instantiated as a global variable
        students = new ArrayList<>();
        students = new ServiceImplementation().getStudent(); //take all the values in this list 
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

}
