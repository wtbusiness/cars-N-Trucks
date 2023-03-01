public class Car {

    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }


    // instance variables
    int speed;
    double regularPrice;
    String color;

    // default implementation of getSalePrice() method
    public double getSalePrice() {
        return regularPrice;
    }
}

