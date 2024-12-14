package com.peoplemanager.model;

import static com.peoplemanager.utils.GenerateUID.generateUID;
import static com.peoplemanager.utils.Validates.validateCourse;
import static com.peoplemanager.utils.Validates.validateGrades;

public class Student extends People {
  private final int UID = generateUID();
  private String course;
  private float[] grades;

  public Student(String name, int age, String gender, String course, float[] grades) {
    super(name, age, gender);

    validateCourse(course);
    validateGrades(grades);

    this.course = course;
    this.grades = grades;
  }

  public int getUID() { return UID; }
  public String getCourse() { return course; }
  public float[] getGrades() { return grades; }

  public void setCourse(String course) { this.course = course; }
  public void setGrades(float[] grades) { this.grades = grades; }

  public float getAverage() {
    float sum = 0;
    for (float grade : grades) {
      sum += grade;
    }

    return sum / grades.length;
  }
}
