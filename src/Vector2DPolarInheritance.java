public class Vector2DPolarInheritance extends Vector2D {
    public Vector2DPolarInheritance(double x, double y) {
        super(x, y);
    }

    public double getAngle() {
        return Math.atan2(super.getComponents()[1], super.getComponents()[0]);
    }
}