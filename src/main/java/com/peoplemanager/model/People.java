package com.peoplemanager.model;

import static com.peoplemanager.utils.Formatter.ageFormatter;
import static com.peoplemanager.utils.Formatter.stringFormatter;
import static com.peoplemanager.utils.GenerateUID.generateUID;
import static com.peoplemanager.utils.Validates.*;

public class People {
  private final int UID = generateUID();
  private String name;
  private final String birthDate;
  private final int age;
  private String gender;

  public People(String name, String birthDate, String gender) {
    validateName(name);
    validateGender(gender);
    validateBirthDate(birthDate);
    int age = ageFormatter(birthDate);
    validateAge(age);

    this.name = stringFormatter(name);
    this.birthDate = birthDate;
    this.age = age;
    this.gender = stringFormatter(gender);
  }

  public int getUID() { return UID; }
  public String getName() { return name; }
  public String getBirthDate() { return birthDate; }
  public int getAge() { return age; }
  public String getGender() { return gender; }

  public void setName(String name) {
    validateName(name);
    this.name = stringFormatter(name);
  }

  public void setGender(String gender) {
    validateGender(gender);
    this.gender = stringFormatter(gender);
  }
}
