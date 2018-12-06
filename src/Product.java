import java.util.Collections;
import java.util.Date;

class Product implements Item, Comparable<Product> {

  private int serialNumber;
  private String manufacturer;
  private Date manufacuredOn;
  private String name;
  private static int currentProductionNumber = 1;

  //constructor sets name, manufacured, and currentProductionNumber

  public Product(String name) {
    this.name = name;
    this.serialNumber = currentProductionNumber;
    this.manufacuredOn = new Date();
    manufacturer = Item.manufacturer;
    currentProductionNumber++;
  }
  /**
   * Overrides toString method to format the output of the fields within the class.
   */
  @Override
  public String toString() {
    String output = "Manufacturer : " + manufacturer + "\n";
    output = output + "Serial number : " + serialNumber + "\n";
    output = output + "Date : " + manufacuredOn + "\n";
    output = output + "Name : " + name + "\n";
    return output;
  }

  //allows productionnumber to be changed on certain object
  public void setProductionNumber(int productionNumber) {
    serialNumber = currentProductionNumber++;
  }

  //allows name to be changed on certain object
  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public Date getManufacturerDate() {
    return manufacuredOn;
  }

  @Override
  public int getSerialNumber() {
    return serialNumber;
  }

  //Used to specify that names are being sorted when Collections.sort is used
  @Override
  public int compareTo(Product o) {
    return this.name.compareTo(o.getName());
  }
}

