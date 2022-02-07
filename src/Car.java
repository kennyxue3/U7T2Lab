public class Car {
    private String model;
    private int miles;

    public Car(String model, int miles) {
        this.model = model;
        this.miles = miles;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public String toString() {
        return model + " " + miles + "mi";
    }
}
