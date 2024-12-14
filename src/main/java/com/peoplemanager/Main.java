package com.peoplemanager;

import com.peoplemanager.model.Student;

public class Main {
  public static void main(String[] args) {
    float[] grades = { 8, 7.5f, 9.5f, 10 };

    try {
      Student student = new Student("Alice de Souza", 18, "Feminino", "Análise e Desenvolvimento de Sistemas", grades);

      System.out.println("Nome: " + student.getName());
      System.out.println("Idade: " + student.getAge());
      System.out.println("Gênero: " + student.getGender());
      System.out.println("Curso: " + student.getCourse());
      for(int i = 0; i < student.getGrades().length; i++) {
        System.out.println("Nota " + (i + 1) + ": " + student.getGrades()[i]);
      }
      System.out.println("Média: " + student.getAverage());
    } catch(IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }
}