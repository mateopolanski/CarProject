import java.util.List;

public class CarTest extends CarCatalog{



    public static void main(String[] args) {


        CarCatalog carCatalogue = new CarCatalog();
        Car carCatalogAbstract = new Car();
//        carCatalogue.printCarList();
        CarSearchMethods carSearch = new CarSearchMethods();

//        //carSearch.printCarList();
//
        List<Car> result = carSearch.searchByCategory(carSearch.carArrayList);
        List<Car> result2 = carSearch.searchByManufacturer(result, carSearch.scanner);
        List<Car> result3 = carSearch.searchByModel(result2);
        List<Car> result4 = carSearch.searchByEngine(result3);
        List<Car> result5 = carSearch.searchByPrice(result4);
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
