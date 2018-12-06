import java.util.ArrayList;
import java.util.Collections;

/**
 * The main method of the JP release program is used just to create a UserInteraction
 * object which is what the users ultimately interact with. The rest of the main class
 * is used for testing purposes
 */

public class Main {

  public static void main(String[] args) {
    UserInteraction userInteraction = new UserInteraction();     //Start the part of the program the user can
    ArrayList<Product> products = new ArrayList<>();//interact with
    products = testCollection();
    Collections.sort(products);                   //sorts products by name using collections sort
    print(products);
    EmployeeInfo e1 = new EmployeeInfo();
    System.out.println(e1.getCode());
  }

  /**
   * Driver to check that different products can be created as objects after objects are created
   * they are added to arraylist named products.
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
  }/**
   * loop though arrayList and print out element.
   */
  public static <T> void print(ArrayList<T> products) {
    for (T object : products) {
      System.out.println(object);
    }
  }
}





