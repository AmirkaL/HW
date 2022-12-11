package Figure;

public class Triangle extends home4 {
    private double width, height;

    public Triangle() {
        this.width = 1;
        this.height = 1;
    }

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getC() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

    public double getArea() {
        return 0.5 * (width * height);
    }

    public double getPerimeter() {
        return width + height + getC();
    }
}
