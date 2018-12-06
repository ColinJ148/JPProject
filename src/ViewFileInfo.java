import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * The ViewFileInfo class is used for letting the user be able to read from the file
 * with all the products and employees they have wrote the the file.
 */
public class ViewFileInfo {

  private String fileContent;

  /**
   * constructor that find the file and than reads from it placing it in the
   * private String variable fileContent to the be printed if needed.
   */
  public ViewFileInfo() {
    int i;
    FileReader fr = null;
    try {
      fr = new FileReader("C:\\LineTest\\TestResult.txt");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    try {
      while ((i = fr.read()) != -1) {
        fileContent += ((char) i);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * Prints out the content of the file.
   */
  public void printContent() {
    System.out.println(fileContent);
  }
}
