
import java.util.ArrayList;
import java.util.Collections;


/**
 * * Main method of JPProject that is mainly used for testing purposes at
 * the moment. JPProject Alpha is the beginning of
 * a template created in Java for creating and recording all
 * future production line items. The goal is to create a
 * flexible structure that would then be easily modifiable to
 * handle different products.
 * By: Colin Joyce
 */


public class Main {

  public static void main(String[] args) {
    ArrayList<Product> products = new ArrayList<>();
    products = testCollection();
    Collections.sort(products);         //sorts products by name using collections sort
    print(products);
  }

  /**
   * Driver to check that different products can be created
   * as objects after objects
   * are created they are added to arraylist named products.
   */
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

  /**
   * loop though arrayList and print out element
   * @param products
   */
  public static void print(ArrayList<Product> products){
    for (Product object: products) {
      System.out.println(object);
    }
    }

  }





