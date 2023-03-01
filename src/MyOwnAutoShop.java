public class MyOwnAutoShop {
    public static void main(String[] args) {

        // Create an instance of the Sedan class and initialize all the fields with appropriate values
        Sedan sedan = new Sedan(22, 20000, "blue", 25);

        // Create two instances of the Ford class and initialize all the fields with appropriate values
        Ford ford1 = new Ford(2015, 1000, 15000, "red", 40);
        Ford ford2 = new Ford(2017, 2000, 20000, "green", 45);

        // Create an instance of the Car class and initialize all the fields with appropriate values
        Car car = new Car(60, 10000, "yellow");

        // Display the sale prices of all instances
        System.out.println("Sale price of Sedan: " + sedan.getSalePrice());
        System.out.println("Sale price of Ford1: " + ford1.getSalePrice());
        System.out.println("Sale price of Ford2: " + ford2.getSalePrice());
        System.out.println("Sale price of Car: " + car.getSalePrice());
    }
}
