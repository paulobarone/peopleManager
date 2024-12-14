package com.peoplemanager.model;

import static com.peoplemanager.utils.GenerateUID.generateUID;

public class Teacher extends People {
  private final int UID = generateUID();
  private Course course;

  public Teacher(String name, int age, String gender) {
    super(name, age, gender);
  }

  public Course getCourse() { return course; }

  public void setCourse(Course course) {
    this.course = course;
  }

  public int getUID() { return UID; }
}
