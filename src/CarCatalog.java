import java.util.*;
import java.util.stream.Collectors;

public class CarCatalog extends Car {


    //osobna metoda do objektow
    Car toyotaCamry = new Car("SUV", "TOYOTA", "CAMRY", 3.0, 1200);
    Car volvoXC90 = new Car("SUV", "VOLVO", "XC90", 2.0, 15000);
    Car mercedesGLC = new Car("COUPE", "MERCEDES", "GLC60", 3.0, 17000);
    Car wartburg311 = new Car("HATCHBACK", "WARTBURG", "311", 1.2, 5000);
    Car skodaSuperb = new Car("SPORT", "SKODA", "SUPERB", 2.0, 9000);
    Car skodaEnyaq = new Car("SUV", "SKODA", "ENYAQ", 2.0, 22000);
    Car mazdaMX5 = new Car("SPORT", "MAZDA", "MX-5", 2.0, 24000);
    Car toyotaSupra = new Car("SPORT", "TOYOTA", "SUPRA", 3.0, 55100);
    Car volkswagenGolf = new Car("HATCHBACK", "VOLKSWAGEN", "GOLF", 1.9, 16000);
    Car hondaAccord = new Car("COUPE", "HONDA", "ACCORD", 1.5, 27000);
    Car hondaCivic = new Car("HATCHBACK", "HONDA", "CIVIC", 1.2, 17000);
    Car toyotaGR86 = new Car("COUPE", "TOYOTA", "GR86", 1.1, 27700);


    List<Car> carArrayList = Arrays.asList(toyotaCamry, volvoXC90, mercedesGLC, wartburg311, skodaSuperb, skodaEnyaq,
            mazdaMX5, toyotaSupra, volkswagenGolf, hondaAccord, hondaCivic, toyotaGR86);


    public void printCarList() {

        for (Car c : carArrayList)
            System.out.println(c);
    }
}
