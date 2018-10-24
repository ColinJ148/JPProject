public class MoviePlayer extends Product implements MultimediaControl {
  private Screen monitor = new Screen();
  private MonitorType type = MonitorType.LCD;

  public MoviePlayer(String name) {
    super(name);
  }


  public String toString(){
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
