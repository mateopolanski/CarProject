import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarSearchMethods extends CarCatalog {

    Scanner scanner = new Scanner(System.in);
    List<Car> resultCat, resultByMan, resultByMod, resultByEng, resultByPrice;
    String message = "does not exist on the list";

    public List<Car> searchByCategory(List<Car> carArrayList) {

        this.carArrayList = carArrayList;

        System.out.println("Enter Category: ");
        String category = scanner.next().toUpperCase();
        //
        List<Car> resultByCat = carArrayList.stream()
                .filter(line -> line.getCategory().contains(category))     //
                .collect(Collectors.toList());
        if (resultByCat.isEmpty()) {
            System.out.println("Category " + message);
            System.exit(1);
        } else resultByCat.forEach(System.out::println);
        return resultByCat;
    }

    public List<Car> searchByManufacturer(List<Car> resultCat) {


        this.resultCat = resultCat;

        System.out.println("Enter Manufacturer: ");
        String manufacturer = scanner.next().toUpperCase();
        resultByMan = resultCat.stream()
                .filter(line -> line.getManufacture().contains(manufacturer))
                .collect(Collectors.toList());

        if (resultByMan.isEmpty()) {
            System.out.println("Manufacturer " + message);
            System.exit(1);
        } else resultByMan.forEach(System.out::println);

        return resultByMan;
    }


    public List<Car> searchByModel(List<Car> resultByMan) {

        this.resultByMan = resultByMan;

        System.out.println("Enter Model: ");
        String model = scanner.next().toUpperCase();
        resultByMod = resultByMan.stream()
                .filter(line -> line.getModel().contains(model))
                .collect(Collectors.toList());

        if (resultByMod.isEmpty()) {
            System.out.println("Model " + message);
            System.exit(1);
        } else resultByMod.forEach(System.out::println);
        return resultByMod;
    }

    public List<Car> searchByEngine(List<Car> resultByMod) {

        this.resultByMod = resultByMod;

        System.out.println("Enter Engine: ");
        double engine = scanner.nextDouble();
        resultByEng = resultByMod.stream()
                .filter(line -> line.getEngine() == engine)
                .collect(Collectors.toList());

        if (resultByEng.isEmpty()) {
            System.out.println("Engine " + message);
            System.exit(1);
        } else resultByEng.forEach(System.out::println);
        return resultByEng;
    }

    public List<Car> searchByPrice(List<Car> resultByEng) {

        this.resultByEng = resultByEng;

        System.out.println("Enter Price: ");
        int price = scanner.nextInt();
        resultByPrice = resultByEng.stream()
                .filter(line -> line.getPrice() == price)
                .collect(Collectors.toList());

        if (resultByPrice.isEmpty()) {
            System.out.println("Entered price does not match any records");
            System.exit(1);
        } else resultByPrice.forEach(System.out::println);
        return resultByPrice;
    }
}
