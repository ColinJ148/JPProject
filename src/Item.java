import java.util.Date;

//interface to implement methods for Product subclass

public interface Item {

  String manufacturer = "Oracle Production";

  void setProductionNumber(int productionNumber);

  void setName(String name);

  String getName();

  Date getManufacturerDate();

  int getSerialNumber();


}
