/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shetu.serviceImplementation;

import com.shetu.entity.Student;
import com.shetu.service.StudentService;
import com.shetu.util.NewHibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author J2EE 37
 */
public class ServiceImplementation implements StudentService {

    //Things are common for all the methods all of them are criss-crossed
    //1. SessionFactory
    //2. Session
    //3. Transcation
    //4. Call the mebthod 
    //5. Commit
    @Override
    public void insert(Student student) {
        ///Session factroy
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        //Session 
        Session sn = sf.getCurrentSession();
        //Transaction
        Transaction tr = sn.beginTransaction();
        //call save method from the hibernate and pass the object to it
        sn.save(student); //this save method is from hibernate
        //commit
        tr.commit();
    }

    @Override
    public void update(Student student) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sn = sf.getCurrentSession();
        Transaction tr = sn.beginTransaction();
        sn.update(student);
        tr.commit();
    }

    @Override
    public void delete(Student student) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sn = sf.getCurrentSession();
        Transaction tr = sn.beginTransaction();
        sn.delete(student);
        tr.commit();

    }

    @Override
    public List<Student> getStudent() {
        List<Student> stu = new ArrayList<>();
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sn = sf.getCurrentSession();
        Transaction tr = sn.beginTransaction();
        //call the method
        stu = sn.createCriteria(Student.class).list();
        tr.commit();
        return stu;
    }

}
