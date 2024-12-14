package com.peoplemanager.utils;

import java.util.Random;

import java.util.HashSet;
import java.util.Set;

public class GenerateUID {
  private static final Set<Integer> generatedUIDs = new HashSet<>();

  public static int generateUID() {
    Random random = new Random();
    int uid;
    do {
      uid = random.nextInt(9000) + 1000;
    } while (generatedUIDs.contains(uid));
    generatedUIDs.add(uid);
    return uid;
  }
}