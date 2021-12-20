import java.util.Arrays;
import java.util.List;

public class CarTest extends CarCatalog{



    public static void main(String[] args) {

//        Car car1 = new Car();
//        Car car2 = new Car();


//        CarCatalog carCatalogue = new CarCatalog();

//        carCatalogue.printCarList();
        CarSearchMethods carSearch = new CarSearchMethods();

//        //carSearch.printCarList();

        CarCatalog ss = new CarCatalog();
        List<CarCatalog> lista = ss.initCarCatalog();
//      List<Strig> categoryList = List.of("SUV","MINIVAN");
        List<CarCatalog> result = carSearch.searchByCategory(lista);
        List<CarCatalog> result2 = carSearch.searchByManufacturer(result);
        List<CarCatalog> result3 = carSearch.searchByModel(result2);
        List<CarCatalog> result4 = carSearch.searchByEngine(result3);
        List<CarCatalog> result5 = carSearch.searchByPrice(result4);
        System.out.println("Your chosen car is: " + result5);




        /*
        REFACTOR METHODS TRY
         */
//        CarSearchBaseShortened searchBaseShortened = new CarSearchBaseShortened();
//        List <Car> r1 = searchBaseShortened.searchByCategory(carSearch.carArrayList);



        /*
        overriding
         */
//        carCatalogAbstract.warning();
//        carSearch.warning();
//        carSearch.warning();
        /*
        overloading
        */
//        carSearch.warning();

        //refactor
        //switch + break +continue
        // operatory
    }
}
