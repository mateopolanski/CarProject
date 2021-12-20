import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarSearchMethods extends CarCatalog {

    public List<CarCatalog> list = initCarCatalog();
    UserCommunication communication = new UserCommunication();

    Scanner scanner = new Scanner(System.in);
    List<CarCatalog> resultByCat, resultByMan, resultByMod, resultByEng, resultByPrice;




    public List<CarCatalog> searchByCategory(List<CarCatalog> carArrayList) {

        this.list = carArrayList;

        System.out.println("Enter Category: ");
        String category = scanner.next().toUpperCase();

        List<CarCatalog> resultByCat = list.stream()
                .filter(line -> line.getCategory().contains(category))
                .collect(Collectors.toList());
        if (resultByCat.isEmpty()) {
            communication.searchNotExist("Category");
            System.exit(1);
        } else resultByCat.forEach(System.out::println);
        return resultByCat;
    }

    public List<CarCatalog> searchByManufacturer(List<CarCatalog> resultCat) {


        this.resultByCat = resultCat;

        System.out.println("Enter Manufacturer: ");
        String manufacturer = scanner.next().toUpperCase();
        resultByMan = resultCat.stream()
                .filter(line -> line.getManufacture().contains(manufacturer))
                .collect(Collectors.toList());

        if (resultByMan.isEmpty()) {
            communication.searchNotExist("Manufacturer");
            System.exit(1);
        } else resultByMan.forEach(System.out::println);

        System.out.println("asdsa");

        return resultByMan;
    }


    public List<CarCatalog> searchByModel(List<CarCatalog> resultByMan) {

        this.resultByMan = resultByMan;

        System.out.println("Enter Model: ");
        String model = scanner.next().toUpperCase();
        resultByMod = resultByMan.stream()
                .filter(line -> line.getModel().contains(model))
                .collect(Collectors.toList());

        if (resultByMod.isEmpty()) {
            communication.searchNotExist("Model");
            System.exit(1);
        } else resultByMod.forEach(System.out::println);
        return resultByMod;
    }

    public List<CarCatalog> searchByEngine(List<CarCatalog> resultByMod) {

        this.resultByMod = resultByMod;

        System.out.println("Enter Engine: ");
        double engine = scanner.nextDouble();
        resultByEng = resultByMod.stream()
                .filter(line -> line.getEngine() == engine)
                .collect(Collectors.toList());

        if (resultByEng.isEmpty()) {
            communication.searchNotExist("Engine");
            System.exit(1);
        } else resultByEng.forEach(System.out::println);
        return resultByEng;
    }

    public List<CarCatalog> searchByPrice(List<CarCatalog> resultByEng) {

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
