package org.vntu.postavka.forma;

//import javax.swing.*;
import static javax.swing.JOptionPane.*;

public class Application {

public static void main(String[] args) {

  Analitics analitics;
  String results;

  analitics = new Analitics();
  results = showInputDialog("Введіть ідентифікаційних номер:");
  analitics.setIDNumber(results);

  results = showInputDialog("Введіть дату замовлення:");
  analitics.setOrderDate(results);

  results = showInputDialog("Введіть час замовлення:");
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

//  System.out.println("ID: " + analitics.getIDNumber());
  System.out.println("Report: " + analitics.toString());

  

  }
}

/*    
  int option;
// Тип пиктограммы
  option = JOptionPane.showConfirmDialog(null, "Строк реалізації товару короткий?", "Автоматизована система", JOptionPane.YES_NO_OPTION);
  if (option == 0) {
    showMessageDialog(null,"Реалізація замовлення!");
    System.exit(0);
  }

  option = JOptionPane.showConfirmDialog(null, "Строк реалізації товару середній?", "Автоматизована система", JOptionPane.YES_NO_OPTION);
  if (option == 0) { 
    showMessageDialog(null,"Реалізація замовлення поставлена в чергу.");
    System.exit(0);
  }

  option = JOptionPane.showConfirmDialog(null, "Черга велика?", "Автоматизована система", JOptionPane.YES_NO_OPTION);
  if (option == 0)  
    showMessageDialog(null,"Товар направляється до складу.");
  else
    showMessageDialog(null,"Реалізація замовлення поставлена в чергу.");
  }
*/
//}
