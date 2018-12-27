public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Audi", 2, 180);
        Lorry lorry1 = new Lorry("Scania", 10, 300, 10);
        System.out.println(lorry1.getPower());
        lorry1.setPower(400);
        System.out.println(lorry1.getPower());
        lorry1.changeCapacity(50);
        System.out.println(lorry1.getCapacity());
    }
}
