import java.util.Scanner;
import java.util.regex.Pattern;

public class EmployeeInfo {

  private StringBuilder name = new StringBuilder();
  private String code;
  private String deptId;
  private Pattern p;
  private Scanner in = new Scanner(System.in);

  public EmployeeInfo() {
    p = Pattern.compile("[A-Z][a-z]{3}[0-9]{2}");
    setName();
    setDeptId();
    if (checkName(name)) {
      createEmployeeCode(name);
    } else {
      System.out.println("name not valid.");
    }
    getId();
    reverseString(deptId);
    in.close();

  }

  @Override
  public String toString() {
    String output;
    output = name.toString() + "\n";
    output += code + "\n" + deptId;
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
    System.out.println("Please Enter Department ID:");
    deptId = in.nextLine();
    return deptId;
  }

  private void setDeptId() {
    getDeptId();
  }

  private String getId() {
    if (validId(deptId)) {
      this.deptId = deptId;
    } else {
      this.deptId = "None01";
    }
    return deptId;
  }

  private boolean validId(String id) {
    if (Pattern.matches("[A-Z][a-z]{3}[0-9]{2}", id)) {
      return true;
    }
    return false;
  }
  public String reverseString(String id){
    String reversed = "";
    for(int i = id.length() - 1; i >= 0; i--)
    {
      reversed = reversed + id.charAt(i);
    }
    deptId = reversed;
    return deptId;
  }

  public static void main(String[] args) {
    EmployeeInfo emp1 = new EmployeeInfo();
    System.out.println(emp1.toString());
  }
}
