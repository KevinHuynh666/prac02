package shapes;

public class shapeTester {
    public static void main(String[] args)
    {
        Cube c = new Cube(5);
        System.out.println("Cube area: " + c.surfaceArea());
        System.out.println("Cube volume: " +c.volume());

        Tetrahedron t = new Tetrahedron(5);
        System.out.println("Tetrahedron area: " + t.surfaceArea());
        System.out.println("Tetrahedron volume: " + t.volume());

        Cylinder cy = new Cylinder(4,5);
        System.out.println("Cylinder area: " + cy.surfaceArea());
        System.out.println("Cylinder volume: " +cy.volume());
    }
}
