import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ProcessFiles {

  private Path p = Paths.get("C:\\LineTest");
  private Path p2 = Paths.get("C:\\LineTest\\TestResult.txt");
  private Path p3 = Paths.get("TestReault.txt").resolve("C:\\LineTest\\");

  private void CreateDirectory() {

    new File("C:\\LineTest").mkdir();
    String p3 = "C:" + File.separator + "LineTest" + File.separator + "TestResult.txt";
    File f = new File(p3);
    f.getParentFile().mkdir();
    try {
      f.createNewFile();
      System.out.println("File Created");
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

  public void WriteFile(EmployeeInfo emp) throws IOException {
    FileWriter fileWriter = new FileWriter("C:\\LineTest\\TestResult.txt", true);
    PrintWriter printWriter = new PrintWriter(fileWriter);
    printWriter.println(emp.toString());
    printWriter.close();
  }

  public void WriteFile(ArrayList<Product> products) throws IOException {
    FileWriter fileWriter = new FileWriter("C:\\LineTest\\TestResult.txt", true);
    PrintWriter printWriter = new PrintWriter(fileWriter);
    printWriter.println(products.toString());
    printWriter.close();
  }

  public static void main(String[] args) {
    ProcessFiles p1 = new ProcessFiles();
    p1.CreateDirectory();
    EmployeeInfo emp1 = new EmployeeInfo();
    EmployeeInfo emp2 = new EmployeeInfo();
    try {
      p1.WriteFile(emp1);
      p1.WriteFile(emp2);
      System.out.println("write successful");
    } catch (IOException e) {
      e.printStackTrace();
    }

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

    try {
      p1.WriteFile(products);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
