package com.peoplemanager.model;

public class Student extends People {
  private String course;
  private float[] grades;

  public Student(String name, int age, String gender, String course, float[] grades) {
    super(name, age, gender);

    validateCourse(course);
    validateGrades(grades);

    this.course = course;
    this.grades = grades;
  }

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

  private void validateCourse(String course) {
    if (course == null || course.isEmpty()) {
      throw new IllegalArgumentException("O aluno precisa estar em um curso");
    }
  }

  private void validateGrades(float[] grades) {
    if (grades == null) {
      throw new IllegalArgumentException("Insira um valor válido para as notas");
    }

    for (float grade : grades) {
      if (grade < 0 || grade > 10) {
        throw new IllegalArgumentException("Nota inválida. A nota deve ser maior ou igual a 0 e menor ou igual a 10");
      }
    }
  }
}
