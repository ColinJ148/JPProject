public class AudioPlayer extends Product implements MultimediaControl {


  private String audioSpecification;
  private ItemType mediaType;

  public AudioPlayer(String name, String audioSpecification) {
    super(name);
    this.audioSpecification = audioSpecification;
    this.mediaType = mediaType;
  }


  public String toString() {
    String output;
    output = super.toString();
    output += "Audio Specification: " + audioSpecification + "\n";
    output += "Audio Type: " + mediaType;
    return output;
  }

  @Override
  public void play() {
    System.out.println("playing");

  }

  @Override
  public void stop() {
    System.out.println("stop");

  }

  @Override
  public void previous() {
    System.out.println("previous");

  }

  @Override
  public void next() {
    System.out.println("next");

  }


}
