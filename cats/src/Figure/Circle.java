package Figure;

public class Circle extends home4 {
    private double radius;
    final double pi = Math.PI;

    public Circle() {
        this.radius = 1;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return (pi * Math.pow(radius, 2));
    }
    public double getPerimeter() {
        return (2 * pi * radius);
    }
    public double getCapacCircle() {
        return getArea() / Math.pow(getPerimeter(), 2);
    }
}
