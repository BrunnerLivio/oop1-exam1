package ch.fhnw.oop1.en1.bikeshop;

public class Bike {
  private int weight;
  private String brand;

  public Bike(String brand, int weight) {
    this.weight = weight;
    this.brand = brand;
  }

  public String getBrand() {
    return brand;
  }

  public int getWeight() {
    return weight;
  }

  public String getFormattedWeight() {
    // Weils ein "int" ist, löscht es die Nachkommazahlen...
    int kg = weight / 1000;
    // Deshalb ist kg * 1000 nur noch die Kilogramme (in Gramm=
    int gramm = weight - (kg * 1000);
    return kg + "kg " + gramm + "gr";
  }

  public String getInfo() {
    return String.format("Brand: %s", brand);
  }
}
