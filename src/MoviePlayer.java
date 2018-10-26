public class MoviePlayer extends Product implements MultimediaControl {

  private Screen monitor;
  private MonitorType type;

  public MoviePlayer(String name, Screen screen, MonitorType type) {
    super(name);
    this.monitor = screen;
    this.type = type;
  }


  public String toString() {
    String output = super.toString();
    output += "Screen: " + monitor + "\n";
    output += "MonitorType: " + type + "\n";
    return output;
  }


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
