import java.util.Scanner;
import java.util.regex.Pattern;

public class EmployeeInfo {

  private StringBuilder name = new StringBuilder();
  private String code;
  private String deptId;
  private Pattern p;
  private Scanner in = new Scanner(System.in);

  public EmployeeInfo() {
    setName();
    if (checkName(name)) {
      createEmployeeCode(name);
    } else {
      System.out.println("name not valid.");
    }
    setDeptId();

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
    whitespace = name.indexOf(" ");                    //find index of whitespace
    code += name.substring(whitespace, name.length());  //Lastname part of employee code
    code = code.replace(" ", "");      //remove whitespace
  }

  private String inputName() {
    String userInput;

    System.out.println("Enter Employee Name");
    userInput = in.nextLine();
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

  public String getDeptId() {
    deptId = in.nextLine();
    return deptId;
  }

  private void setDeptId() {
    getDeptId();
    if (validId(deptId)) {
      this.deptId = deptId;
    } else {
      this.deptId = "None01";
    }
  }

  private String getId() {
    return "1";
  }

  private boolean validId(String id) {
    boolean valid = false;    //set error
    for (char c : deptId.toString().toCharArray()) {
      if (Character.isUpperCase(c)) {
        valid = true;
      }
      return true;

    }
    return true;
  }
}
