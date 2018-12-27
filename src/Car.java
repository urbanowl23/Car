public class Car {
    String brand;
    private int weight;
    protected int power;

    public Car(String brand, int weight, int power) {
        this.brand = brand;
        this.weight = weight;
        this.power = power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void changePower(int power) {
        this.power += power;
    }
}

