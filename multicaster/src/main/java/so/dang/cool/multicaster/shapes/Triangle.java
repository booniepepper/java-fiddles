package so.dang.cool.multicaster.shapes;

import so.dang.cool.multicaster.shapes.misc.Point2d;

public class Triangle implements Shape {
    Point2d a;
    Point2d b;
    Point2d c;

    Triangle(Point2d a, Point2d b, Point2d c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static Triangle of(Point2d a, Point2d b, Point2d c) {
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
