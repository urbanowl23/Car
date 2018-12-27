public class Lorry extends Car {
    private int capacity;

    public Lorry(String brand, int weight, int power, int capacity) {
        super(brand, weight, power);
        this.capacity = capacity;
    }

    public int getPower() {
        return this.power;
    }

    public int getCapacity() {
        return this.capacity;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void changeCapacity(int capacity) {
        this.capacity += capacity;
    }
}
