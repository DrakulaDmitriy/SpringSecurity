package web.models;

public class Car {
    private String brand;
    private String model;
    private int year;

    public Car() {
    }

    public Car(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.year = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
