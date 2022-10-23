package so.dang.cool.multicaster;

import java.util.List;

import so.dang.cool.multicaster.shapes.Circle;
import so.dang.cool.multicaster.shapes.Triangle;
import so.dang.cool.multicaster.shapes.misc.Point2d;

class Main {
    public static void main(String[] args) {
        var shapes = List.of(
            Triangle.of(
                new Point2d(0.0, 0.0),
                new Point2d(4.0, 0.0),
                new Point2d(4.0, 3.0)
            ),
            Circle.of(
                new Point2d(-1.0, -1.0),
                2.0
            )
        );

        shapes.forEach(s -> {
            System.out.println("---");
            System.out.printf("Area:      %f%n", s.area());
            System.out.printf("Perimeter: %f%n", s.perimeter());

            s.to(Triangle.class).ifPresent(t ->
                System.out.println(t.someTriangleThing())
            );


            s.to(Circle.class).ifPresent(c ->
                System.out.println(c.someCircleThing())
            );
        });
    }
}