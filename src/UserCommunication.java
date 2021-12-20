import java.util.Locale;
import java.util.Scanner;

public class UserCommunication extends CarCatalog {

    Scanner scanner = new Scanner(System.in);
    String s;
    double d;
    int i;

    public void searchNotExist(String s){

        String message = " does not exist on the list";
        System.out.println(s + message);
    }

//    public String enterValue (String value){
//
//        System.out.println("Enter " +value + " :");
//        s = scanner.next().toUpperCase();
//        return this.s.toUpperCase(Locale.ROOT);
//    }


}
