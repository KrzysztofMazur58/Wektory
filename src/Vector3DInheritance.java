public class Vector3DInheritance extends Vector2D {
    private double z;

    public Vector3DInheritance(double x, double y) {
        this(x, y, 0);
    }

    public Vector3DInheritance(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public double abs() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    @Override
    public double cdot(IVector param) {
        double[] paramComponents = param.getComponents();
        return x * paramComponents[0] + y * paramComponents[1] + z * 0;
    }

    @Override
    public double[] getComponents() {
        return new double[]{x, y, z};
    }

    public Vector3DInheritance cross(IVector param) {
        double[] v1Components = getComponents();
        double[] v2Components = param.getComponents();

        double crossX = v1Components[1] * v2Components[2] - v1Components[2] * v2Components[1];
        double crossY = v1Components[2] * v2Components[0] - v1Components[0] * v2Components[2];
        double crossZ = v1Components[0] * v2Components[1] - v1Components[1] * v2Components[0];

        return new Vector3DInheritance(crossX, crossY, crossZ);
    }

    public IVector getSrcV() {
        return this;
    }
}

