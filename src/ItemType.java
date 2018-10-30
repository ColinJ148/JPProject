/**
 * enum to have pre-set types that
 * stores code to each type of item type.
 */
public enum ItemType {

  AU("AUDIO"), VI("VISUAL"), AM("AUDIOMOBILE"), VM("VISUALMOBILE");
  private final String itemType;

  ItemType(String itemType) {

    this.itemType = itemType;
  }
}
