public class Screen implements ScreenSpec {
  private String resolution;
  private int refreshrate;
  private int responsetime;


  public Screen(){
    resolution = "1920x1080";
    refreshrate = 2;
    responsetime = 41;

  }

  public String toString(){
    String output;
    output = "Screen resolution: " + resolution + "\n";
    output += "Screen refresh rate: " + refreshrate + "\n";
    output += "Screen respone time: " + responsetime + "\n";
    return output;
  }
  @Override
  public String getResolution() {
    return resolution;
  }

  @Override
  public int getRefreshRate() {
    return refreshrate;
  }

  @Override
  public int getResponseTime() {
    return responsetime;
  }
}
