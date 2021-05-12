package org.vntu.postavka.forma;

import javax.swing.*;
import static javax.swing.JOptionPane.*;

public class Application {

  public static void main(String[] args) {

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
}
