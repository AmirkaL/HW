package Figure;

public class Rectangle extends home4 {
    private double width, height;

    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getCapac() {
        return getArea() / Math.pow(getPerimeter(), 2);
    }
}
