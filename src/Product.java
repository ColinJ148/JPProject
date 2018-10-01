import java.util.Date;

abstract class Product implements Item {

  private int serialNumber;
  private String manufacturer;
  private Date manufacuredOn;
  private String name;
  private static int currentProductionNumber;

  //constructor sets name and sets manufacuredOn
  //as well as currentProductionNumber
  public Product(String name) {
    this.name = name;
    this.serialNumber = currentProductionNumber;
    this.manufacuredOn = new Date();
    manufacturer = Item.manufacturer;
    currentProductionNumber++;

  }

  //Overrides toString method to format the output of the fields within the class.
  @Override
  public String toString() {
    //A really bad way to format the output String
    String output = "Manufacturer:" + manufacturer + "\n";
    output = output + "Serial number:" + serialNumber + "\n";
    output = output + "Date:" + manufacuredOn + "\n";
    output = output + "name:" + name;

    return output;
  }


  public void setProductionNumber(int productionNumber) {
    serialNumber = currentProductionNumber++;
  }

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
}

