package com.peoplemanager.utils;

public class Formatter {
  public static String StringFormatter(String value) {
    return value.substring(0, 1).toUpperCase() + value.substring(1);
  }
}
