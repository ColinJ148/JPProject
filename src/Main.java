/**
 * Main method of JPProject that is mainly used for testing purposes at the moment. JPProject Alpha is the beginning of
 * a template created in Java for creating and recording all future production line items. The goal is to create a
 * flexible structure that would then be easily modifiable to handle different products.
 *
 * By: Colin Joyce
 */


public class Main {

  public static void main(String[] args) {
//    Widget w1 = new Widget("Widget 1");
//    System.out.println(w1.toString());
//
//    Widget w2 = new Widget("Widget 2");
//    System.out.println(w2.toString());
//
//    for (ItemType it : ItemType.values()) {
//      System.out.println(it);
//    }

//    AudioPlayer player = new AudioPlayer("music","1.0",ItemType.Au);
//    System.out.println(player.toString());
//    player.next();
//
//
//    Screen s1 = new Screen();
//    System.out.println(s1.toString());
//
    MoviePlayer moviePlayer = new MoviePlayer("moviewatcher");
    System.out.println(moviePlayer.toString());
    moviePlayer.play();

    MultimediaControlTestClass tester = new MultimediaControlTestClass();
    tester.play();
    tester.stop();
  }

}

/**
 * Driver class to test the abstract class Product *Contructor that takes a String called variable and than calls its
 * super and passes it name.
 */
class Widget extends Product {

  public Widget(String name) {
    super(name);
  }
}