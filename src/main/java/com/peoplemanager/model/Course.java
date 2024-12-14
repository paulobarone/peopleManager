package com.peoplemanager.model;

import java.util.ArrayList;

import static com.peoplemanager.utils.GenerateUID.generateUID;
import static com.peoplemanager.utils.Validates.validateName;

public class Course {
  private final int UID = generateUID();
  private String name;
  private String level;
  private int duration;
  private ArrayList<Student> students;
  private Teacher teacher;

  public Course(String name, String level, int duration) {
    this.name = name;
    this.level = level;
    this.duration = duration;
    this.students = new ArrayList<>();
  }

  public int getUID() { return UID; }
  public String getName() { return name; }
  public String getLevel() { return level; }
  public int getDuration() { return duration; }
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

  public void setDuration(int duration) {
    if(duration <= 0) {
      throw new IllegalArgumentException("A duração do curso precisa ser maior que 0");
    }
    this.duration = duration;
  }

  public void setTeacher(Teacher teacher) {
    this.teacher = teacher;
  }

  public void setStudents(ArrayList<Student> students) {
    this.students = students;
  }

  public void addStudent(Student student) {
    this.students.add(student);
  }
}
