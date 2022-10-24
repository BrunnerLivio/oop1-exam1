package ch.fhnw.oop1.en1.bikeshop;

public class EBike extends Bike {
  private int wh;

  public EBike(String brand, int weight, int wh) {
    super(brand, weight);
    this.wh = wh;
  }

  public int getBatteryEnergy() {
    return this.wh;
  }

  @Override
  public int getWeight() {
    return super.getWeight() + (wh * 5);
  }

  @Override
  public String getInfo() {
    return String.format("e-Bike - %s [%dWh]", super.getInfo(), wh);
  }
}
