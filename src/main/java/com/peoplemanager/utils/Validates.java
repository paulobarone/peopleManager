package com.peoplemanager.utils;

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
      throw new IllegalArgumentException("Idade precisa ser maior que 0 e menor que 150");
    }
  }

  public static void validateGender(String gender) {
    if (gender == null || gender.isEmpty()) {
      throw new IllegalArgumentException("O gênero não pode ser vazio");
    }

    String genderNormalized = gender.toLowerCase();
    boolean isValid = genderNormalized.equals("masculino") || genderNormalized.equals("feminino") || genderNormalized.equals("outro");

    if (!isValid) {
      throw new IllegalArgumentException("Gênero inválido. Opções válidas: Masculino, Feminino ou Outro");
    }
  }

  public static void validateCourse(String course) {
    if (course == null || course.isEmpty()) {
      throw new IllegalArgumentException("O aluno precisa estar em um curso");
    }
  }

  public static void validateGrades(ArrayList<Float> grades) {
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
