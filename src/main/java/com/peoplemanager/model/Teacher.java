package com.peoplemanager.model;

import java.util.ArrayList;

import static com.peoplemanager.utils.GenerateUID.generateUID;

public class Teacher extends People {
  private final int UID = generateUID();
  private String name;
  private int age;
  private String gender;
  private String course;
  private ArrayList<Student> students;

  public Teacher(String name, int age, String gender, String course, ArrayList<Student> students) {
    super(name, age, gender);

    this.course = course;
    this.students = students;
  }

  public int getUID() { return UID; }
  public String getCourse() { return course; }
  public ArrayList<Student> getStudents() { return students; }

  public void setCourse(String course) { this.course = course; }
  public void setStudents(ArrayList<Student> students) { this.students = students; }
}
