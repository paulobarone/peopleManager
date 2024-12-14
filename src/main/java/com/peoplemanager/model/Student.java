package com.peoplemanager.model;

import java.util.ArrayList;

import static com.peoplemanager.utils.Validates.validateGrades;

public class Student extends People {
  private ArrayList<Float> grades;
  private Course course;

  public Student(String name, String birthDate, String gender, ArrayList<Float> grades) {
    super(name, birthDate, gender);

    validateGrades(grades);

    this.grades = grades;
  }

  public ArrayList<Float> getGrades() { return grades; }
  public Course getCourse() { return course; }

  public void setGrades(ArrayList<Float> grades) { this.grades = grades; }

  public void addGrade(float grade) {
    grades.add(grade);
  }

  public float getAverage() {
    float sum = 0;
    for (float grade : grades) {
      sum += grade;
    }

    float average = sum / grades.size();
    return (float) (Math.ceil(average * 2) / 2);
  }

  public void setCourse(Course course) {
    this.course = course;
  }
}
