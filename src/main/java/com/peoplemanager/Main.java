package com.peoplemanager;

import com.peoplemanager.model.Course;
import com.peoplemanager.model.Student;
import com.peoplemanager.model.Teacher;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Course> courseList = new ArrayList<>();

    try {
      Teacher rodrigoTeacher = new Teacher("Rodrigo", "12-05-1987", "Masculino");
      Student joaoStudent = new Student("João", "15-03-2001", "Masculino", new ArrayList<>(java.util.Arrays.asList(8.5f, 9.0f, 7.5f, 0f)));
      Student dudaStudent = new Student("Duda", "22-07-1998", "Feminino", new ArrayList<>(java.util.Arrays.asList(8.5f, 9.0f, 4.5f, 10.0f)));
      Student eduStudent = new Student("Edu", "30-11-1996", "Masculino", new ArrayList<>(java.util.Arrays.asList(5.5f, 9.0f, 2.5f, 4.0f)));
      Student fabiStudent = new Student("Fabi", "10-02-1994", "Feminino", new ArrayList<>(java.util.Arrays.asList(8.5f, 1.0f, 7.5f, 10.0f)));
      Course adsCourse = new Course("Análise e Desenvolvimento de Sistemas", "Graduação", 4);
      courseList.add(adsCourse);
      adsCourse.setTeacher(rodrigoTeacher);
      adsCourse.setStudents(new ArrayList<>(java.util.Arrays.asList(joaoStudent, dudaStudent, eduStudent, fabiStudent)));

      Teacher mariaTeacher = new Teacher("Maria", "19-08-1992", "Feminino");
      Student aliceStudent = new Student("Alice", "25-01-2000", "Feminino", new ArrayList<>(java.util.Arrays.asList(2.5f, 0f, 5.5f)));
      Student bobStudent = new Student("Bob", "14-06-2003", "Masculino", new ArrayList<>(java.util.Arrays.asList(7.5f, 3.0f, 5.5f)));
      Student carolStudent = new Student("Carol", "05-09-1998", "Feminino", new ArrayList<>(java.util.Arrays.asList(3.5f, 3.0f, 4.5f)));
      Student danStudent = new Student("Dan", "20-12-1997", "Masculino", new ArrayList<>(java.util.Arrays.asList(7.5f, 2.0f, 1.5f)));
      Course csCourse = new Course("Ciência da Computação", "Doutorado", 5);
      courseList.add(csCourse);
      csCourse.setTeacher(mariaTeacher);
      csCourse.setStudents(new ArrayList<>(java.util.Arrays.asList(aliceStudent, bobStudent, carolStudent, danStudent)));

      for(Course course : courseList) {
        System.out.println("\n=== " + course.getName() + " ===");
        System.out.println("Professor: " + course.getTeacher().getName());
        for(Student student : course.getStudents()) {
          System.out.printf("Aluno: %s - Média: %.2f\n", student.getName(), student.getAverage());
        }
      }
    } catch(IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }
}