package shapes;

public class Cube implements Shape {
    double a;

    public Cube (double edge){
        a = edge;
    }
    public double volume()
    {
        return Math.pow(a,3);
    }

    public double surfaceArea()
    {
        return 6* Math.pow(a,2);
    }
}
