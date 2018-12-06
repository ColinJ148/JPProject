/**
 * Class AudioPlayer extends product and implements multimediaControl to allow a AudioPlayer object
 * to be created while still having product information and having all multimediacontrol methods.
 */
public class AudioPlayer extends Product implements MultimediaControl {

  private String audioSpecification;
  private ItemType mediaType = ItemType.AU;

  public AudioPlayer(String name, String audioSpecification) {
    super(name);
    this.audioSpecification = audioSpecification;
  }

  /**
   * * toString method to return a formatted string of information on the AudioPlayer which includes
   * the Audio Specification and Audio type as well as everything from product.
   */

  public String toString() {
    String output;
    output = super.toString();
    output += "Audio Specification : " + audioSpecification + "\n";
    output += "Audio Type : " + mediaType + "\n";
    return output;
  }

  /**
   * The 4 methods below are implemented from MultimediaControl and are used to control the
   * AudioPlayer.
   */
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
