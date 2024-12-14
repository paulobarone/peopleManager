package com.peoplemanager.model;

import java.util.ArrayList;

import static com.peoplemanager.utils.GenerateUID.generateUID;
import static com.peoplemanager.utils.Validates.*;

public class Course {
  private final int UID = generateUID();
  private String name;
  private String level;
  private int semester;
  private ArrayList<Student> students;
  private Teacher teacher;

  public Course(String name, String level, int semester) {
    validateName(name);
    validateCourseLevel(level);
    validateCourseDuration(semester);

    this.name = name;
    this.level = level;
    this.semester = semester;
    this.students = new ArrayList<>();
  }

  public int getUID() { return UID; }
  public String getName() { return name; }
  public String getLevel() { return level; }
  public int getDuration() { return semester; }
  public Teacher getTeacher() { return teacher; }
  public ArrayList<Student> getStudents() { return students; }

  public void setName(String name) {
    validateName(name);
    this.name = name;
  }

  public void setLevel(String level) {
    validateName(level);
    this.level = level;
  }

  public void setSemester(int semester) {
    validateCourseDuration(semester);
    this.semester = semester;
  }

  public void setTeacher(Teacher teacher) {
    validateCourseTeacher(teacher);
    this.teacher = teacher;
  }

  public void setStudents(ArrayList<Student> students) {
    validateCourse(teacher);
    for(Student student : students) {
      validateStudentCourse(student);
    }

    this.students = students;
  }

  public void addStudent(Student student) {
    validateCourse(teacher);
    validateStudentCourse(student);
    this.students.add(student);
  }
}
