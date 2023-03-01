public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(100, 20000, "Red");
        System.out.println("Sale price of Car 1: " + car1.getSalePrice());

        Truck truck1 = new Truck(150, 30000, "Blue", 2500);
        System.out.println("Sale price of Truck 1: " + truck1.getSalePrice());

        Ford ford1 = new Ford(120, 25000, "Black", 2022, 5000);
        System.out.println("Sale price of Ford 1: " + ford1.getSalePrice());

        Sedan sedan1 = new Sedan(90, 18000, "Green", 18);
        System.out.println("Sale price of Sedan 1: " + sedan1.getSalePrice());
    }
}