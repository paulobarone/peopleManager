package com.peoplemanager.model;
import static com.peoplemanager.utils.Formatter.StringFormatter;
import static com.peoplemanager.utils.Validates.*;

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
}
