
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Main method of JPProject that is mainly used for testing purposes at the moment. JPProject Alpha is the beginning of
 * a template created in Java for creating and recording all future production line items. The goal is to create a
 * flexible structure that would then be easily modifiable to handle different products.
 *
 * By: Colin Joyce
 */


public class Main {

  public static void main(String[] args) {
    ArrayList<Product> products = new ArrayList<>();
    products = testCollection();
    Collections.sort(products);
    System.out.println(products);
  }

  // Step 15
  // Complete the header for the testCollection method here

  public static ArrayList<Product> testCollection() {

    AudioPlayer a1 = new AudioPlayer("iPod Mini", "MP3");
    AudioPlayer a2 = new AudioPlayer("Walkman", "WAV ");
    MoviePlayer m1 = new MoviePlayer("DBPOWER MK101",
        new Screen(" 720x480", 40, 22), MonitorType.LCD);
    MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK",
        new Screen("1366x768", 40, 22), MonitorType.LED);

    ArrayList<Product> products = new ArrayList<>();

    products.add(a1);
    products.add(a2);
    products.add(m1);
    products.add(m2);
    return products;
  }

  public void printALL(ArrayList<Product> products) {

  }
  // Step 16
  // Create print method here

}

/**
 * Driver class to test the abstract class Product *Contructor that takes a String called variable and than calls its
 * super and passes it name.
 */
//class Widget extends Product {
//
//  public Widget(String name) {
//    super(name);
//  }
//}