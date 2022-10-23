package so.dang.cool.multicaster.shapes.misc;

public record Point2d(double x, double y) {
    public double distanceTo(Point2d that) {
        double dX = this.x - that.x;
        double dY = this.y - that.y;
        return Math.sqrt(dX * dX + dY * dY);
    }
}
