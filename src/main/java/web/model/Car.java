package web.model;

public class Car {
    private String model;
    private int number;
    private int power;

    public Car(String model, int number, int power) {
        this.model = model;
        this.number = number;
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
