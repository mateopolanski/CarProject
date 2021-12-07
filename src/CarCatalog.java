import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CarCatalog {

    Car toyotaCamry = new Car("SUV", "Toyota", "Camry", 3.0, 1200);
    Car volvoXC90 = new Car("SUV", "Volvo", "XC90", 2.0, 15000);
    Car mercedesGLC = new Car("Coupe", "Mercedes", "GLC60", 3.0, 17000);
    Car wartburg311 = new Car("Hatchback", "Wartburg", "311", 1.2, 5000);
    Car skodaSuperb = new Car("Sport", "Skoda", "Superb", 2.0, 9000);
    Car skodaEnyaq = new Car("SUV", "Skoda", "Enyaq", 2.0, 22000);

    Scanner scanner = new Scanner(System.in);

    List<Car> carArrayList = Arrays.asList(toyotaCamry,volvoXC90,mercedesGLC,wartburg311,skodaSuperb,skodaEnyaq);

    public void printCarList () {

        for (Car c: carArrayList)
            System.out.println(c);
        Predicate f1 = x -> x.equals("Volvo");
        System.out.println("Predicate: "+f1.toString());

    }

    public void searchCar () {


        List<Car> result = carArrayList.stream()                // convert list to stream
                .filter(line -> !"ricky".equals(line))     // we dont like ricky
                .collect(Collectors.toList());              // collect the output and convert streams to a List

        result.forEach(System.out::println);

    }



//        System.out.println("Please enter category");
//        String category = scanner.nextLine();
//        for (Car element : carArrayList){
//            if (element.equals(category)){
//                System.out.println(element);
//            }
//        }
//    }

//    public List<Car> findCarModel(String name){
//
//        for (Car car : carArrayList) {
//            if (Car.getCategory().contains(name)) {
//                return carArrayList;
//            }
//        }
//        return null;
//    }

}
