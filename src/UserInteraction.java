import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * UserInteraction will allow users to add and view information though the console about employee
 * information as well as multimedia products.
 */
public class UserInteraction {

  private Scanner scanner;
  private int optionSelect;
  ArrayList<Product> products = new ArrayList<>();
  /**
   * Contructor to create both a Scanner and ProcessFiles object that are used though out
   * the class.
   */
  public UserInteraction() {
    ProcessFiles p1 = new ProcessFiles();
    p1.CreateDirectory();
    scanner = new Scanner(System.in);
    start(p1);
  }

  /**
   * start method to begin gathering user input as well as handling it.
   */

  private void start(ProcessFiles p1){
    Collections.sort(products);
    try {
      p1.WriteFile(products);
    } catch (IOException e) {
      e.printStackTrace();
    }
    optionMenu();
    userInput();
    userInputHandler(p1);

  }

  /**
   * Gives users dialog to interact with.
   */
  private void optionMenu() {
    System.out.println("1. Add Employee.");
    System.out.println("2. Add Product.");
    System.out.println("3. View Employees and products added so far");
  }

  /**
   * Gets users input with error handling to prevent crashing the program due to bad user input.
   */
  private void userInput() {
    try {
      System.out.println("What would you like to do?");
      System.out.println("Type 1-3 and then enter based on what task you want to complete.");
      optionSelect = scanner.nextInt();
      if (optionSelect > 3){
        System.out.println("Not a valid input, try again");
        userInput();
      }
    } catch (InputMismatchException e) {
      System.out.println("Not a valid input");
      System.out.println("Try again!");
      scanner.nextLine();
      userInput();
    }
  }
  /**
   * userInputHandler handles the users input and makes objects based off the users
   * request. When the objects are created they are then added to a Arraylist of products
   * which is then wrote to a file which the user can then access later.
   */
  private void userInputHandler(ProcessFiles p1) {
    String userRequest;
    String[] specs = new String[4]; //array to hold user request on product specs to then be created into objects.
    switch (optionSelect) {
      /**
       * case 1 lets users add employees
       */
      case 1:
        System.out.println("Add Employee Selected.");
        EmployeeInfo empInfo = new EmployeeInfo();
        try {
          p1.WriteFile(empInfo);
          System.out.println("Employee Added to file!");
        } catch (IOException e) {
          System.out.println("File not found");
          e.printStackTrace();
        }
        start(p1);
        break;
      /**
       * case 2 lets users add either a audio or movie device.
       */
      case 2:
        System.out.println("Add Product Selected.");
        System.out.println("Would you like to add a Audio Player or Movie Player?");
        scanner.nextLine();
        userRequest = scanner.nextLine();
        userRequest = userRequest.toLowerCase();
        if (userRequest.equals("audio player")) {
          System.out.println("Audio Player selected.");
          System.out.println("Whats the name of the audio player");
          specs[0] = scanner.nextLine();

          System.out.println("What is the audio Specification?");
          specs[1] = scanner.nextLine();
          AudioPlayer audioPlayer = new AudioPlayer(specs[0], specs[1]);
          products.add(audioPlayer);
          System.out.println("Audio Player added!");

        } else if (userRequest.equals("movie player")) {
          System.out.println("Movie Player selected");
          System.out.println("Whats the name of the Movie Player?");
          specs[0] = scanner.nextLine();
          System.out.println("What is the resolution of the screen?");
          specs[1] = scanner.nextLine();
          System.out.println("What is the refresh rate on the screen?");
          specs[2] = scanner.nextLine();
          System.out.println("What is the response time of the screen?");
          specs[3] = scanner.nextLine();
          MoviePlayer moviePlayer = new MoviePlayer(specs[0],
              new Screen(specs[1],Integer.parseInt(specs[2]), Integer.parseInt(specs[3])),
              MonitorType.LED);
          products.add(moviePlayer);
          System.out.println("Movie player added!");
        } else {
          System.out.println("Sorry we can't process that type of product at this time");
        }
        start(p1);
        break;
      /**
       * case 3 allows users to file all employees and products they have added to the file.
       */
      case 3:
        ViewFileInfo fileInfo = new ViewFileInfo();
        fileInfo.printContent();
        start(p1);
        break;
    }


  }

}
