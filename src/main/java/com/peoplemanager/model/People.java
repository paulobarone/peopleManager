package com.peoplemanager.model;
import java.util.regex.Pattern;
import static com.peoplemanager.utils.Formatter.StringFormatter;

public class People {
  private String name;
  private int age;
  private String gender;

  public People(String name, int age, String gender) {
    validateName(name);
    validateAge(age);
    validateGender(gender);

    this.name = StringFormatter(name);
    this.age = age;
    this.gender = StringFormatter(gender);
  }

  public String getName() { return name; }
  public int getAge() { return age; }
  public String getGender() { return gender; }

  public void setName(String name) {
    validateName(name);
    this.name = StringFormatter(name);
  }

  public void setAge(int age) {
    validateAge(age);
    this.age = age;
  }

  public void setGender(String gender) {
    validateGender(gender);
    this.gender = StringFormatter(gender);
  }

  private void validateName(String name) {
    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException("Nome não pode ser vazio");
    }

    Pattern NAME_PATTERN = Pattern.compile("[a-zA-Z\\s]+");
    if (!NAME_PATTERN.matcher(name).matches()) {
      throw new IllegalArgumentException("Nome inválido. O nome deve conter apenas letras e espaços");
    }
  }

  private void validateAge(int age) {
    if (age <= 0 || age >= 150) {
      throw new IllegalArgumentException("Idade precisa ser maior que 0 e menor que 150");
    }
  }

  private void validateGender(String gender) {
    if (gender == null || gender.isEmpty()) {
      throw new IllegalArgumentException("O gênero não pode ser vazio");
    }

    String genderNormalized = gender.toLowerCase();
    boolean isValid = genderNormalized.equals("masculino") || genderNormalized.equals("feminino") || genderNormalized.equals("outro");

    if (!isValid) {
      throw new IllegalArgumentException("Gênero inválido. Opções válidas: Masculino, Feminino ou Outro");
    }
  }
}
