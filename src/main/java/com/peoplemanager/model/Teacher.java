package com.peoplemanager.model;

public class Teacher extends People {
  private Course course;

  public Teacher(String name, String birthDate, String gender) {
    super(name, birthDate, gender);
  }

  public Course getCourse() { return course; }

  public void setCourse(Course course) {
    this.course = course;
  }
}
