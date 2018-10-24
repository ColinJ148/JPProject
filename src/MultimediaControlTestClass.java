public class MultimediaControlTestClass implements MultimediaControl {

  @Override
  public void play() {
    System.out.println("Device is playing");
  }

  @Override
  public void stop() {
    System.out.println("Device has stopped playing");
  }

  @Override
  public void previous() {
    System.out.println("Changing to previous");
  }

  @Override
  public void next() {
    System.out.println("Changing to next");
  }
}
