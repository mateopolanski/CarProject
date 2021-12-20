public abstract class Car {

    protected String category;
    protected String manufacturer;
    protected String model;
    protected double engine;
    protected int price;

    public Car() {
    }

    public Car(String category, String manufacturer, String model, double engine, int price) {
        this.category = category;
        this.manufacturer = manufacturer;
        this.model = model;
        this.engine = engine;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getManufacture() {
        return manufacturer;
    }

    public void setManufacture(String manufacture) {
        this.manufacturer = manufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return " Car {" +
                "category='" + category + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                ", price=" + price +
                '}';

        //overloading
    }

}
