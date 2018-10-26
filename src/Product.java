import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

class Product implements Item {

  private int serialNumber;
  private String manufacturer;
  private Date manufacuredOn;
  private String name;
  private static int currentProductionNumber = 1;

  //constructor sets name and sets manufacuredOn
  //as well as currentProductionNumber
  ArrayList<String> names = new ArrayList<String>();

  public Product(String name) {

    this.name = name;
    this.serialNumber = currentProductionNumber;
    this.manufacuredOn = new Date();
    manufacturer = Item.manufacturer;
    currentProductionNumber++;
    names.add(name);
  }

  //Overrides toString method to format the output of the fields within the class.
  @Override
  public String toString() {
    String output = "Manufacturer:" + manufacturer + "\n";
    output = output + "Serial number:" + serialNumber + "\n";
    output = output + "Date:" + manufacuredOn + "\n";
    output = output + "Name:" + name + "\n";
    getSortednames();
    return output;
  }

  public void getSortednames(){
    Collections.sort(names);
    for(String counter: names){
      System.out.println(counter);
    }
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

