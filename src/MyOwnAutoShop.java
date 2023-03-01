public class MyOwnAutoShop {
    public static void main(String[] args) {
        // Create an instance of the Sedan class and initialize all the fields with appropriate values
        Sedan sedan = new Sedan();
        sedan.speed = 100;
        sedan.regularPrice = 20000;
        sedan.color = "Red";
        sedan.length = 25;

        // Create two instances of the Ford class and initialize all the fields with appropriate values
        Ford ford1 = new Ford();
        ford1.speed = 120;
        ford1.regularPrice = 30000;
        ford1.color = "Blue";
        ford1.year = 2022;
        ford1.manufacturerDiscount = 5000;

        Ford ford2 = new Ford();
        ford2.speed = 110;
        ford2.regularPrice = 25000;
        ford2.color = "Black";
        ford2.year = 2021;
        ford2.manufacturerDiscount = 3000;

        // Create an instance of the Car class and initialize all the fields with appropriate values
        Car car = new Car();
        car.speed = 80;
        car.regularPrice = 15000;
        car.color = "Green";

        // Display the sale prices of all instances
        System.out.println("Sale price of Sedan: " + sedan.getSalePrice());
        System.out.println("Sale price of Ford 1: " + ford1.getSalePrice());
        System.out.println("Sale price of Ford 2: " + ford2.getSalePrice());
        System.out.println("Sale price of Car: " + car.getSalePrice());
    }
}
