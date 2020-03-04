package shapes;

public class ShapeHandler {
    // Returns the sum of the volumes of the given shapes.
    public static double volumeSum(Shape[] shapes) {
        double totalVol = 0;
        for( Shape i : shapes)
        {
            totalVol += i.volume();
        }
        return totalVol;
    }

    // Returns the sum of the surface areas of the given shapes.
    public static double surfaceAreaSum(Shape[] shapes) {
        double totalSum = 0;
        for( Shape i : shapes)
        {
            totalSum += i.surfaceArea();
        }
        return totalSum;
    }

    public static void main(String[] args)
    {
        Shape[] a = new Shape[]{new Cube(5),new Tetrahedron(5), new Cylinder(4,5)};
        System.out.println(volumeSum(a));
    }

}
