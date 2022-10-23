package so.dang.cool;

public class Triangle implements Shape {
    Point a;
    Point b;
    Point c;

    Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static Triangle of(Point a, Point b, Point c) {
        return new Triangle(a, b, c);
    }

    @Override
    public double area() {
        return (
            a.x() * (b.y() - c.y())
            + b.x() * (c.y() - a.y())
            + c.x() * (a.y() - b.y())
        ) / 2;
    }

    @Override
    public double perimeter() {
        return a.distanceTo(b)
            + b.distanceTo(c)
            + c.distanceTo(a);
    }

    public String someTriangleThing() {
        return "Pretend this is more mathy!";
    }
}
