public class Vector2D implements IVector{

    protected double x;
    protected double y;

    public Vector2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public double abs() {
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public double cdot(IVector param) {
        double[] components = param.getComponents();
        return this.x * components[0] + this.y * components[1];
    }

    @Override
    public double[] getComponents() {
        return new double[] {x , y};
    }
}
