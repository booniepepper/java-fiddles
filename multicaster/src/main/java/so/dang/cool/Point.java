package so.dang.cool;

public record Point(double x, double y) {
    double distanceTo(Point that) {
        double dX = this.x - that.x;
        double dY = this.y - that.y;
        return Math.sqrt(dX * dX + dY * dY);
    }
}
