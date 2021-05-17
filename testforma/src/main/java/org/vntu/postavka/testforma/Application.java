package org.vntu.postavka.testforma;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static javax.swing.JOptionPane.*;

public class Application {

public static boolean isValidNumeric(String str) {
  str = str.trim(); // trims the white spaces.
  
  if(str.length() == 0)
    return false;
  
// if string is of length 1 and the only
// character is not a digit
  if (str.length() == 1 && !Character.isDigit(str.charAt(0)))
    return false;
  
// If the 1st char is not '+', '-', '.' or digit
  if (str.charAt(0) != '+' && str.charAt(0) != '-'
    && !Character.isDigit(str.charAt(0))
    && str.charAt(0) != '.')
  return false;

  return true;
}

public static boolean isValidTime(String time) {
// Regex to check valid time in 24-hour format.
// Time: 13:05
  String regex = "([01]?[0-9]|2[0-3]):[0-5][0-9]";
 
// Compile the ReGex
  Pattern p = Pattern.compile(regex);
 
// If the time is empty
// return false
  if (time == null) {
  return false;
  }
 
// Pattern class contains matcher() method
// to find matching between given time
// and regular expression.
  Matcher m = p.matcher(time);
 
// Return if the time
// matched the ReGex
  return m.matches();
}

public static boolean isValidDate(final String date) {
// Returns true if date is in format
// /dd/mm/yyyy
  String regex = "^(1[0-2]|0[1-9])/(3[01]"
                       + "|[12][0-9]|0[1-9])/[0-9]{4}$";
  Pattern pattern = Pattern.compile(regex);
  Matcher matcher = pattern.matcher((CharSequence)date);
  return matcher.matches();

}

public static void main(String[] args) {

  Analitics analitics;
  String results;

  analitics = new Analitics();

  results = showInputDialog("Введіть ідентифікаційних номер:");
  if (!isValidNumeric(results))
    showMessageDialog(null, "Помилка у визначенні номера!");
  else
    analitics.setIDNumber(results);

  results = showInputDialog("Введіть дату замовлення:");

  if (!isValidDate(results))
    showMessageDialog(null, "Помилка у визначенні дати!");
  else
    analitics.setOrderDate(results);

  results = showInputDialog("Введіть час замовлення:");
  if (!isValidTime(results))
    showMessageDialog(null, "Помилка у визначенні часу!");
  else
    analitics.setOrderTime(results);

  results = showInputDialog("Введіть дату реалізації товару:");
  analitics.setCustomerDate(results);

  results = showInputDialog("Введіть час реалізації товару:");
  analitics.setCustomerTime(results);

  results = showInputDialog("Введіть адресу замовника:");
  analitics.setCustomerAddress(results);

  results = showInputDialog("Введіть адресу постачальника:");
  analitics.setProviderAddress(results);

  results = showInputDialog("Введіть ім'я постачальника:");
  analitics.setProviderName(results);

  results = showInputDialog("Введіть дату закупки товару:");
  analitics.setProviderDate(results);

  results = showInputDialog("Введіть час закупки товару:");
  analitics.setProviderTime(results);

  System.out.println("Report: " + analitics.toString());

  

  }
}

