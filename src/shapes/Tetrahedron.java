package shapes;
public class Tetrahedron implements Shape {
    double a;
    public Tetrahedron(double edge) {
        a = edge;
    }

    public double volume() {
        return Math.pow(a,3) / (6 * Math.sqrt(2));
    }

    public double surfaceArea() {
        return Math.pow(a,2) * Math.sqrt(3);
    }
}
