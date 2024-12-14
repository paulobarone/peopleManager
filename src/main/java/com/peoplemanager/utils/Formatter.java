package com.peoplemanager.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Formatter {
  public static String stringFormatter(String value) {
    return value.substring(0, 1).toUpperCase() + value.substring(1);
  }

  public static int ageFormatter(String birthDateString) {
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
    Date birthDate;

    try {
      birthDate = formatter.parse(birthDateString);
    } catch (ParseException e) {
      throw new IllegalArgumentException("Formato de data inválida. Por favor use: dd-MM-yyyy.");
    }

    Calendar currentDate = Calendar.getInstance();
    Calendar birthDateCal = Calendar.getInstance();
    birthDateCal.setTime(birthDate);

    int age = currentDate.get(Calendar.YEAR) - birthDateCal.get(Calendar.YEAR);

    if (currentDate.get(Calendar.DAY_OF_YEAR) < birthDateCal.get(Calendar.DAY_OF_YEAR)) {
      age--;
    }

    return age;
  }
}
