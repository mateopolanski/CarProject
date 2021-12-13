public class OverrideOverload extends CarCatalog {


    @Override
    public void warning() {
        System.out.println(" Warning Overriding");
    }

    public void warning(String s) {
        System.out.println(" Warning: Overloading " + s);
    }

//    public void warning(){
//        System.out.println("Warningbb");
//    }


    public void warning(int a, String b) {
        System.out.println(" Warning: Overloading " + a + "" + b);
    }
}
