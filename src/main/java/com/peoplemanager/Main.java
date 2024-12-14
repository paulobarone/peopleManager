package com.peoplemanager;

import com.peoplemanager.model.Student;
import com.peoplemanager.model.Teacher;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    float[] grades = { 8, 7.5f, 9.5f, 10 };

    try {
      ArrayList<Student> students = new ArrayList<>();
      Student student = new Student("Alice de Souza", 18, "Feminino", "Análise e Desenvolvimento de Sistemas", grades);
      students.add(student);

      Teacher teacher = new Teacher("Rodrigo Alves", 26, "Masculino", "Análise e Desenvolvimento de Sistemas", students);
      System.out.println("Professor UID: " + teacher.getUID());
      System.out.println("Professor: " + teacher.getName());
      System.out.println("Curso: " + teacher.getCourse());
      System.out.println("=== Alunos ===");
      for(Student s : teacher.getStudents()) {
        System.out.println(s.getUID() + " - " + s.getName());
      }
    } catch(IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }
}