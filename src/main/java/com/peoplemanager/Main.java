package com.peoplemanager;

import com.peoplemanager.model.People;

public class Main {
  public static void main(String[] args) {
    try {
      People people = new People("Alice de Souza", 18, "Masculino");

      System.out.println("Nome: " + people.getName());
      System.out.println("Idade: " + people.getAge());
      System.out.println("Gênero: " + people.getGender());
    } catch(IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }
}