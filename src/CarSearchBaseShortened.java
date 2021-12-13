//import java.util.List;
//import java.util.Scanner;
//import java.util.stream.Collectors;
//
//public class CarSearchBaseShortened extends CarCatalog {
//
//    Scanner scanner = new Scanner(System.in);
//    List<Car> resultCat, resultByMan, resultByMod, resultByEng, resultByPrice;
//    String message = "does not exist on the list";
//    String category, manufacturer = scanner.next().toUpperCase();
//    List<Car> value1;
//    List<Car> value2;
//
//    public void baseSearch(List<Car> value1, List<Car> value2) {
//
//        value1 = value2.stream()
//                .filter(line -> line.getCategory().contains(scanner.next()))     //
//                .collect(Collectors.toList());
//        if (value1.isEmpty()) {
//            System.out.println("Category " + message);
//            System.exit(1);
//        } else value1.forEach(System.out::println);
//    }
//
//
//    public List<Car> searchByCategory(List<Car> value2){
//
//        this.carArrayList = value2;
//        System.out.println("Enter Category: ");
//        category = scanner.next().toUpperCase();
//        baseSearch(value1, value2);
//        return value1;
//    }
//
//    public List<Car> searchByManufacturer(List<Car> resultCat, Scanner model) {
//
//
//        this.resultCat = resultCat;
//
//        System.out.println("Enter Manufacturer: " +model.next());
//
//        resultByMan = resultCat.stream()
//                .filter(line -> line.getManufacture().contains(manufacturer))
//                .collect(Collectors.toList());
//
//        if (resultByMan.isEmpty()) {
//            System.out.println("Manufacturer " + message);
//            System.exit(1);
//        } else resultByMan.forEach(System.out::println);
//
//        return resultByMan;
//    }
//
//
//    public List<Car> searchByModel(List <Car> resultByMan){
//
//        this.resultByMan = resultByMan;
//
//        System.out.println("Enter Model: ");
//        String model = scanner.next().toUpperCase();
//        resultByMod = resultByMan.stream()
//                .filter(line -> line.getModel().contains(model))
//                .collect(Collectors.toList());
//
//        if (resultByMod.isEmpty()) {
//            System.out.println("Model " +message);
//            System.exit(1);
//        }
//        else resultByMod.forEach(System.out::println);
//        return resultByMod;
//    }
//
//    public List <Car> searchByEngine(List<Car> resultByMod){
//
//        this.resultByMod = resultByMod;
//
//        System.out.println("Enter Engine: ");
//        double engine = scanner.nextDouble();
//        resultByEng = resultByMod.stream()
//                .filter(line -> line.getEngine() == engine)
//                .collect(Collectors.toList());
//
//        if (resultByEng.isEmpty()) {
//            System.out.println("Engine " +message);
//            System.exit(1);
//        }
//        else resultByEng.forEach(System.out::println);
//        return resultByEng;
//    }
//
//    public List<Car> searchByPrice(List<Car> resultByEng){
//
//        this.resultByEng = resultByEng;
//
//        System.out.println("Enter Price: ");
//        int price = scanner.nextInt();
//        resultByPrice = resultByEng.stream()
//                .filter(line -> line.getPrice() == price)
//                .collect(Collectors.toList());
//
//        if (resultByPrice.isEmpty()) {
//            System.out.println("Entered price does not match any records");
//            System.exit(1);
//        }
//        else resultByPrice.forEach(System.out::println);
//        return resultByPrice;
//    }
//}