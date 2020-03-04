package shapes;

public class Cylinder implements Shape {
    double radius;
    double height;

    public Cylinder(double r, double h){
        radius = r;
        height = h;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }
}
