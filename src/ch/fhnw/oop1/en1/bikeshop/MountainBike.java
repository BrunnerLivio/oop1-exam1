package ch.fhnw.oop1.en1.bikeshop;

public class MountainBike extends Bike {
  private boolean tubeless;

  public MountainBike(String brand, int weight, boolean tubeless) {
    super(brand, weight);
    this.tubeless = tubeless;
  }

  public boolean isTubeless() {
    return tubeless;
  }

  @Override
  public int getWeight() {
    if (tubeless) {
      return super.getWeight() - 200;
    }
    return super.getWeight();
  }

  @Override
  public String getInfo() {
    if (tubeless) {
      return String.format("%s Tubeless", super.getInfo());
    }
    return String.format("%s Tubes", super.getInfo());
  }
}
