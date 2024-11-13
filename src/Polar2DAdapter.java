public class Polar2DAdapter implements IPolar2D, IVector{

    private Vector2D srcVector;

    public Polar2DAdapter(Vector2D srcVector)
    {
        this.srcVector = srcVector;
    }

    @Override
    public double getAngle() {
        double x = srcVector.getComponents()[0];
        double y = srcVector.getComponents()[1];
        return Math.atan2(y, x);
    }

    @Override
    public double abs() {
        return srcVector.abs();
    }

    @Override
    public double cdot(IVector param) {
        return srcVector.cdot(param);
    }

    @Override
    public double[] getComponents() {
        return srcVector.getComponents();
    }
}
