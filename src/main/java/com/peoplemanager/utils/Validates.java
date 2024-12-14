package com.peoplemanager.utils;

import com.peoplemanager.model.Student;
import com.peoplemanager.model.Teacher;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Validates {
  public static void validateName(String name) {
    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException("Nome não pode ser vazio");
    }

    Pattern NAME_PATTERN = Pattern.compile(".*\\d.*");
    if (NAME_PATTERN.matcher(name).matches()) {
      throw new IllegalArgumentException("Nome inválido. O nome não deve conter números");
    }
  }

  public static void validateAge(int age) {
    if (age <= 0 || age >= 150) {
      throw new IllegalArgumentException("A idade precisa ser maior que 0 e menor que 150");
    }
  }

  public static void validateGender(String gender) {
    if (gender == null || gender.isEmpty()) {
      throw new IllegalArgumentException("O gênero é obrigatório");
    }

    String genderNormalized = gender.toLowerCase();
    boolean isValid = genderNormalized.equals("masculino") || genderNormalized.equals("feminino") || genderNormalized.equals("outro");

    if (!isValid) {
      throw new IllegalArgumentException("Gênero inválido. Opções válidas: Masculino, Feminino ou Outro");
    }
  }

  public static void validateGrades(ArrayList<Float> grades) {
    if (grades == null) {
      throw new IllegalArgumentException("Insira um valor válido para as notas");
    }

    for (float grade : grades) {
      if (grade < 0 || grade > 10) {
        throw new IllegalArgumentException("Nota do aluno inválida. A nota deve ser maior ou igual a 0 e menor ou igual a 10");
      }
    }
  }

  public static void validateCourse(Teacher teacher) {
    if (teacher == null) {
      throw new IllegalArgumentException("O curso precisa ter um professor");
    }
  }

  public static void validateCourseLevel(String level) {
    if (level == null || level.isEmpty()) {
      throw new IllegalArgumentException("O nível do curso não pode ser vazio");
    }

    String levelNormalized = level.toLowerCase();
    boolean isValid = levelNormalized.equals("graduação") || levelNormalized.equals("pós-graduação") || levelNormalized.equals("doutorado") || levelNormalized.equals("pós-doutorado");

    if (!isValid) {
      throw new IllegalArgumentException("Nível de curso inválido. Opções válidas: Graduação, Pós-Graduação, Doutorado ou Pós-Doutorado");
    }
  }

  public static void validateCourseDuration(int semester) {
    if (semester <= 0) {
      throw new IllegalArgumentException("A quantidade de semestre do curso precisa ser maior que 0");
    }
  }

  public static void validateCourseTeacher(Teacher teacher) {
    if (teacher.getCourse() != null) {
      throw new IllegalArgumentException(teacher.getName() + " já está vinculado a um curso");
    }
    if (teacher.getAge() < 18) {
      throw new IllegalArgumentException(teacher.getName() + " precisa ser maior de idade para ministrar um curso");
    }
  }

  public static void validateStudentCourse(Student student) {
    if (student.getAge() < 18) {
      throw new IllegalArgumentException(student.getName() + " precisa ser maior de idade para se matricular em um curso");
    } else if (student.getCourse() != null) {
      throw new IllegalArgumentException("Este aluno já está vinculado a um curso");
    }
  }

  public static void validateBirthDate(String birthDate) {
    if (birthDate == null || birthDate.isEmpty()) {
      throw new IllegalArgumentException("Data de nascimento é obrigatória");
    }

    Pattern BIRTH_DATE_PATTERN = Pattern.compile("^\\d{2}-\\d{2}-\\d{4}$");
    if (!BIRTH_DATE_PATTERN.matcher(birthDate).matches()) {
      throw new IllegalArgumentException("Formato de data inválida. Por favor use: dd-MM-yyyy.");
    }
  }
}
