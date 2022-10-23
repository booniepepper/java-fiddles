package so.dang.cool;

public class Circle implements Shape {
    Point center;
    double radius;

    Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public static Circle of(Point center, double radius) {
        return new Circle(center, radius);
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public String someCircleThing() {
        return "The pi is a lie.";
    }
}
