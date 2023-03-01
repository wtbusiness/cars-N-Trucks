public class Truck extends Car {
    int weight;

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        if (weight > 2000) {
            return regularPrice * 0.9; // apply 10% discount
        } else {
            return regularPrice * 0.8; // apply 20% discount
        }
    }
}
