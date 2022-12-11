package Figure;

public class homeClient {
    public static void main(String [] args)
    {
        double width = 7, length = 3;
        home4 rectangle = new Rectangle(width, length);
        System.out.println("Ширина прямоугольника: " + width
                + "\nДлинна прямоугольника: " + length
                + "\nПлощадь: " + rectangle.getArea()
                + "\nПериметр: " + rectangle.getPerimeter() + "."
                + "\nЕмкость: " + ((Rectangle) rectangle).getCapac() + ".");

        home4 triangle = new Triangle(width, length);
        System.out.println("\nСторона a: " + width
        + "\nСторона b: " + length
        + "\nСторона c: " + ((Triangle) triangle).getC()
        + "\nПериметр: " + triangle.getPerimeter()
        + "\nПлощадь: " + triangle.getArea() + ".");

        double radius = 4;
        home4 circle = new Circle(radius);
        System.out.println("\nРадиус окружности: " + radius
                + "\nПлощадь: " + circle.getArea()
                + "\nПериметр: " + circle.getPerimeter() + "."
                + "\nЕмкость: " + ((Circle) circle).getCapacCircle() + ".");


    }}