public class Vector3DDecorator implements IVector {
    private IVector srcVector;
    private double z;

    public Vector3DDecorator(IVector srcVector) {
        this(srcVector, 0);
    }

    public Vector3DDecorator(IVector srcVector, double z) {
        this.srcVector = srcVector;
        this.z = z;
    }

    @Override
    public double abs() {
        double[] components = getComponents();
        return Math.sqrt(components[0] * components[0] + components[1] * components[1] + z * z);
    }

    @Override
    public double cdot(IVector param) {
        double[] v1Components = getComponents();
        double[] v2Components = param.getComponents();
        return v1Components[0] * v2Components[0] + v1Components[1] * v2Components[1] + z * 0;
    }

    @Override
    public double[] getComponents() {
        double[] components = srcVector.getComponents();
        return new double[]{components[0], components[1], this.z};
    }

    public Vector3DDecorator cross(IVector param) {
        double[] v1Components = getComponents();
        double[] v2Components = param.getComponents();

        double crossX = v1Components[1] * v2Components[2] - v1Components[2] * v2Components[1];
        double crossY = v1Components[2] * v2Components[0] - v1Components[0] * v2Components[2];
        double crossZ = v1Components[0] * v2Components[1] - v1Components[1] * v2Components[0];

        return new Vector3DDecorator(new Vector2D(crossX, crossY), crossZ);
    }

    public IVector getSrcV() {
        return srcVector;
    }
}
