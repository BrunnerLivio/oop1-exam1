package ch.fhnw.oop1.en1.bikeshop;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Sie können und sollen die Tests aktivieren (Zeilen-Kommentar entfernen).
 * Ändern Sie aber nicht den enthaltenen JAVA Code!
 */
 public class BikeShopTest {

    @Test
    public void testBike() {
        // String brand = "B1";
        // int weight = 12305;
        // Bike b = new Bike(brand, weight);
        // assertEquals(brand, b.getBrand());
        // assertEquals(weight, b.getWeight());
    }

    @Test
    public void testEBike() {
        // String brand = "B1";
        // int weight = 1000;
        // int wh = 200;
        // EBike b = new EBike(brand, weight, wh);
        // assertEquals(brand, b.getBrand());
        // assertEquals(wh, b.getBatteryEnergy());
        // assertEquals(weight + (wh * 5), b.getWeight());
    }

    @Test
    public void testMountainBike() {
        // String brand = "B1";
        // int weight = 1000;
        // boolean tubeless = true;
        // MountainBike b = new MountainBike(brand, weight, tubeless);
        // assertEquals(brand, b.getBrand());
        // assertEquals(tubeless, b.isTubeless());
        // assertEquals(weight - 200, b.getWeight());
    }

    @Test
    public void testBikeWeightFormatter1() {
        // Bike b = new Bike("B1", 12315);
        // String formattedWeight = b.getFormattedWeight();
        // assertEquals("12kg 315gr", formattedWeight);
    }

    @Test
    public void testBikeInfo() {
        // String brand = "B1";
        // int weight = 12305;
        // Bike b = new Bike(brand, weight);
        // assertEquals("Brand: B1", b.getInfo());
    }
    
    @Test
    public void testMountainBikeInfo() {
        // String brand = "B1";
        // int weight = 12305;
        // boolean tubeless = true;
        // Bike b = new MountainBike(brand, weight, tubeless);
        // assertEquals("Brand: B1 Tubeless", b.getInfo());
    }

    @Test
    public void testMountainBikeInfoTubes() {
        // String brand = "B1";
        // int weight = 12305;
        // boolean tubeless = false;
        // Bike b = new MountainBike(brand, weight, tubeless);
        // assertEquals("Brand: B1 Tubes", b.getInfo());
    }

    @Test
    public void testEBikeInfo() {
        // String brand = "B1";
        // int weight = 12305;
        // int wh = 200;
        // Bike b = new EBike(brand, weight, wh);
        // assertEquals("e-Bike - Brand: B1 [200Wh]", b.getInfo());
    }
    
    @Test
    public void testBikeShopCapacity() {
        // int capacity = 3;
        // BikeShop bs = new BikeShop(capacity);

        // assertTrue(bs.addBike(new Bike("A", 0)));
        // assertTrue(bs.addBike(new EBike("A", 0, 0)));
        // assertTrue(bs.addBike(new MountainBike("A", 0, true)));
        
        // assertFalse(bs.addBike(new EBike("A", 0, 0)));
    }
    
    @Test
    public void testBikeShopWeight() {
        // BikeShop bs = new BikeShop(4);
        
        // bs.addBike(new EBike("B1", 19500, 100));      
        // bs.addBike(new MountainBike("A2", 10200, true)); 

        // bs.addBike(new EBike("A3", 19000, 200));      
        // bs.addBike(new Bike("A4", 10000));           

        // assertEquals(60000, bs.getTotalWeight());
    }
}