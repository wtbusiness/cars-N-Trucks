public class Ford extends Car {
    int year;
    int manufacturerDiscount;

    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color); // Call the constructor of the superclass
        this.year = year; // Assign the value of the year field
        this.manufacturerDiscount = manufacturerDiscount; // Assign the value of the manufacturerDiscount field
    }

    @Override
    public double getSalePrice() {
        double salePrice = super.getSalePrice(); // call the getSalePrice method of the superclass
        return salePrice - manufacturerDiscount; // subtract the manufacturer discount from the sale price
    }
}
