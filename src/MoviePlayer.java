/**
 *  Class MoviePlayer extends product and implements multimediaControl to allow
 * a movieplayer object to be created while still having product information
 * and having all multimediacontrol methods.
 */
public class MoviePlayer extends Product implements MultimediaControl {

  private Screen monitor;
  private MonitorType type;

  /**
   * default Constructor that sets fields that are being passed in
   * @param name
   * @param screen
   * @param type
   */
  public MoviePlayer(String name, Screen screen, MonitorType type) {
    super(name);
    this.monitor = screen;
    this.type = type;
  }

  /** toString method to return a formatted string of information on the
   * movieplayer which includes the screen and
   * monitor type and also everything from product.
   */
  public String toString() {
    String output = super.toString();
    output += "Screen : " + monitor + "\n";
    output += "MonitorType : " + type + "\n";
    return output;
  }

  /**
   * The 4 methods below are implemented from MultimediaControl
   * and are used to control the Movieplayer.
   */
  @Override
  public void play() {
    System.out.println("video play.");
  }

  @Override
  public void stop() {
    System.out.println("video stop.");
  }

  @Override
  public void previous() {
    System.out.println("previous video.");
  }

  @Override
  public void next() {
    System.out.println("next video.");
  }
}
