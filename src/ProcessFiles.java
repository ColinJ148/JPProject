import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * The class ProcessFiles has a method that creates a folder in the users C drive
 * as well as methods to write to a txt file with information on products or employee.
 */
public class ProcessFiles {

  private Path p = Paths.get("C:\\LineTest");
  private Path p2 = Paths.get("C:\\LineTest\\TestResult.txt");
  private Path p3 = Paths.get("TestReault.txt").resolve("C:\\LineTest\\");

  /**
   * Creates a directory in the users C: drive
   */
  public void CreateDirectory() {

    new File("C:\\LineTest").mkdir();
    String p3 = "C:" + File.separator + "LineTest" + File.separator + "TestResult.txt";
    File f = new File(p3);
    f.getParentFile().mkdir();
    try {
      f.createNewFile();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

  /**
   * writes to the file TestResult.txt the employee info
   *
   * @param emp to pull the name and deptId to copy to file
   * @throws IOException Just in case the file doesn't exist
   */
  public void WriteFile(EmployeeInfo emp) throws IOException {
    FileWriter fileWriter = new FileWriter("C:\\LineTest\\TestResult.txt", true);
    PrintWriter printWriter = new PrintWriter(fileWriter);
    printWriter.println(emp.toString());
    printWriter.close();
  }

  /**
   * Writes to the file TestResult.txt with the information pertaining to the products
   *
   * @param products arraylist with products names and specs
   * @throws IOException Just in case the file doesn't exist.
   */
  public void WriteFile(ArrayList<Product> products) throws IOException {
    FileWriter fileWriter = new FileWriter("C:\\LineTest\\TestResult.txt", true);
    PrintWriter printWriter = new PrintWriter(fileWriter);
    printWriter.println(products.toString());
    printWriter.close();
  }
}
