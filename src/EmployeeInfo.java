import java.util.Scanner;
import java.util.regex.Pattern;

public class EmployeeInfo {

  private StringBuilder name = new StringBuilder();
  private String code;
  private String deptId;
  private Scanner in;

  /**
   * Constructor EmployeeInfo gets name and department Id from the user and calls
   * other methods to check if that are valid and then calls a method to reverse the
   * department iD.
   */
  public EmployeeInfo() {
    in = new Scanner(System.in);
    setName();
    setDeptId();

    if (checkName(name)) {
      createEmployeeCode(name);
    } else {
      System.out.println("name not valid.");
    }
    getId();
    reverseString(deptId);


  }

  @Override
  public String toString() {
    String output  = "";
    output += "Employee Code : " + code + "\n" + " Department Number : " +  deptId;
    return output;
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
    whitespace = name.indexOf(" ");                     //find index of whitespace
    code += name.substring(whitespace, name.length());  //Lastname part of employee code
    code = code.replace(" ", "");                       //remove whitespace
  }

  private String inputName() {
    String userInput;
    System.out.println("Please enter your first and last name:");
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

  /**
   * Gets user to enter the department ID
   * @return deptId
   */
  public String getDeptId() {
    System.out.println("Please enter the department ID:");
    deptId = in.nextLine();
    return deptId;
  }

  private void setDeptId() {
    getDeptId();
  }

  private String getId() {
    if (!validId(deptId)) {
      this.deptId = "None01";
    }
    return deptId;
  }

  /**
   * checks if id entered by user is valid using regex
   * @param id being checked if valid.
   * @return  true or false base on if id is valid or not.
   */
  private boolean validId(String id) {
    if (Pattern.matches("[A-Z][a-z]{3}[0-9]{2}", id)) {
      return true;
    }
    return false;
  }

  /**
   * Reverses the id if its valid, otherwise sets id to None01.
   * @param id deptId is reversed
   * @return reversed version of deptId
   */
  public String reverseString(String id) {
    if (deptId.equals("None01")) {
      return deptId;
    } else {
      String reversed = "";
      for (int i = id.length() - 1; i >= 0; i--) {
        reversed = reversed + id.charAt(i);
      }
      deptId = reversed;
      return deptId;
    }
  }

}
