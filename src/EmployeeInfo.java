import java.util.Scanner;

public class EmployeeInfo {

  private StringBuilder name = new StringBuilder();
  private String code;


  public EmployeeInfo() {
    setName();
        if (checkName(name)) {
      createEmployeeCode(name);
    } else {
      System.out.println("name not valid.");
    }

  }

  public StringBuilder getName() {
    return name;
  }

  public String getCode() {
    return code;
  }

  private void setName() {
    inputName();
  }

  private void createEmployeeCode(StringBuilder name) {
    int whitespace;
    code = name.substring(0, 1);
    whitespace = name.indexOf(" ");
    code += name.substring(whitespace,name.length());

  }

  private String inputName() {
    String userInput;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Employee Name");
    userInput = scanner.nextLine();
    name.append(userInput);
    return userInput;
  }

  private boolean checkName(StringBuilder name) {
    boolean check = false;
    for (char c : name.toString().toCharArray()) {
      if (Character.isWhitespace(c)) {
        check = true;
      }
    }

    return check;

  }
}
