/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shetu.implementation;

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
public class StudentImplementation implements StudentService {

    @Override
    public void save(Student student) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sn = sf.getCurrentSession();
        Transaction tr = sn.beginTransaction();
        sn.save(student);
        tr.commit();
    }

    @Override
    public void update(Student student) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sn = sf.getCurrentSession();
        Transaction tr = sn.beginTransaction();
        sn.saveOrUpdate(student);
        tr.commit();
    }

    @Override
    public void delete(Student student) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sn = sf.getCurrentSession();
        Transaction tr = sn.beginTransaction();
        tr.commit();
    }

    @Override
    public List<Student> getStudent() {
      List<Student> list = new ArrayList<>();
      SessionFactory sf = NewHibernateUtil.getSessionFactory();
      Session sn = sf.getCurrentSession();
      Transaction tr = sn.beginTransaction();
      tr.commit();
      return list;
    }

}
