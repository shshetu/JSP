/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shetu.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author J2EE 37
 */

///Using hibernate we will create 3 things:
//1. Table
//2. Id => auto- increment
//3. column name
@Entity
@Table(name = "student")
public class Student {
        //We have to call the generated id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name", nullable = false)
        ///we have to also create a column called name in the hibernate
    //declare the fields
    private String name;
    private String gender;
    private String round;
    private Date startingDate;
    private boolean status;
    private String[] completedCourse;
    private String notes;

    public Student() {
    }

    public Student(int id, String name, String gender, String round, Date startingDate, boolean status, String[] completedCourse, String notes) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.round = round;
        this.startingDate = startingDate;
        this.status = status;
        this.completedCourse = completedCourse;
        this.notes = notes;
    }

    public Student(String name, String gender, String round, Date startingDate, boolean status, String[] completedCourse, String notes) {
        this.name = name;
        this.gender = gender;
        this.round = round;
        this.startingDate = startingDate;
        this.status = status;
        this.completedCourse = completedCourse;
        this.notes = notes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public Date getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String[] getCompletedCourse() {
        return completedCourse;
    }

    public void setCompletedCourse(String[] completedCourse) {
        this.completedCourse = completedCourse;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", gender=" + gender + ", round=" + round + ", startingDate=" + startingDate + ", status=" + status + ", completedCourse=" + completedCourse + ", notes=" + notes + '}';
    }

}
