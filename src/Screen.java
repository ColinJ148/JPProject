/**
 * Class Screen is used when a product has a screen and it sets resolution,
 * refreshrate and responetime.
 */
public class Screen implements ScreenSpec {

  private String resolution;
  private int refreshrate;
  private int responsetime;

  /**
   * Default constructor to set default values to Screen.
   */
  public Screen() {
    resolution = "1920x1080";
    refreshrate = 2;
    responsetime = 41;
  }

  /**
   * Overloaded Constructor that sets resolution, refreshrate and responsetime
   * to Screen object.
   */
  public Screen(String resolution, int refreshrate, int responsetime) {
    this.resolution = resolution;
    this.refreshrate = refreshrate;
    this.responsetime = responsetime;
  }

  /**
   * Overriden toString method to output Screen information.
   */
  public String toString() {
    String output;
    output = "Screen resolution : " + resolution + "\n";
    output += "Screen refresh rate : " + refreshrate + "\n";
    output += "Screen response time : " + responsetime + "\n";
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
