package ch.fhnw.oop1.en1.bikeshop;

public class BikeShop {
  private int shopCapacity;
  private Bike[] bikes;
  private int bikesAmount = 0;

  public BikeShop(int shopCapacity) {
    if (shopCapacity < 0) {
      throw new IllegalArgumentException();
    }

    this.shopCapacity = shopCapacity;
    this.bikes = new Bike[shopCapacity];
  }

  public boolean addBike(Bike bike) {
    if (bikesAmount >= shopCapacity) {
      return false;
    }

    bikes[bikesAmount] = bike;
    bikesAmount++;

    return true;
  }

  public int getTotalWeight() {
    int totalWeight = 0;

    // oder `for (Bike bike : bikes) {`
    // wusste nicht ob man das brauchen darf, deshalb dieser Weg:
    for (int i = 0; i < bikes.length; i++) {
      totalWeight += bikes[i].getWeight();
    }

    return totalWeight;
  }

}
