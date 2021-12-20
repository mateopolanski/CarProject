import java.util.*;
import java.util.stream.Collectors;

public class CarCatalog extends Car {
    // public List<CarCatalog> list = initCarCatalog();

    public CarCatalog(String category, String manufacturer, String model, double engine, int price) {
        super(category, manufacturer, model, engine, price);
    }

    public CarCatalog() {
    }

    //osobna metoda do objektow
   /* public static List<CarCatalog> initArr(){
        if(list==null){
            return new ArrayList<>();
        }else{
            return list;
        }
    }*/

    public List<CarCatalog> initCarCatalog() {

        CarCatalog toyotaCamry = new CarCatalog("SUV", "TOYOTA", "CAMRY", 3.0, 1200);
        //list.add(toyotaCamry);
        CarCatalog volvoXC90 = new CarCatalog("SUV", "VOLVO", "XC90", 2.0, 15000);
        CarCatalog mercedesGLC = new CarCatalog("COUPE", "MERCEDES", "GLC60", 3.0, 17000);
        CarCatalog wartburg311 = new CarCatalog("HATCHBACK", "WARTBURG", "311", 1.2, 5000);
        CarCatalog skodaSuperb = new CarCatalog("SPORT", "SKODA", "SUPERB", 2.0, 9000);
        CarCatalog skodaEnyaq = new CarCatalog("SUV", "SKODA", "ENYAQ", 2.0, 22000);
        CarCatalog mazdaMX5 = new CarCatalog("SPORT", "MAZDA", "MX-5", 2.0, 24000);
        CarCatalog toyotaSupra = new CarCatalog("SPORT", "TOYOTA", "SUPRA", 3.0, 55100);
        CarCatalog volkswagenGolf = new CarCatalog("HATCHBACK", "VOLKSWAGEN", "GOLF", 1.9, 16000);
        CarCatalog hondaAccord = new CarCatalog("COUPE", "HONDA", "ACCORD", 1.5, 27000);
        CarCatalog hondaCivic = new CarCatalog("HATCHBACK", "HONDA", "CIVIC", 1.2, 17000);
        CarCatalog toyotaGR86 = new CarCatalog("COUPE", "TOYOTA", "GR86", 1.1, 27700);

        List<CarCatalog> carArrayList = Arrays.asList(toyotaCamry, volvoXC90, mercedesGLC, wartburg311, skodaSuperb, skodaEnyaq,
                mazdaMX5, toyotaSupra, volkswagenGolf, hondaAccord, hondaCivic, toyotaGR86);
        return carArrayList;
    }

    public void printCarList() {

      /*  for (Car c : list)
            System.out.println(c);*/
    }
}
