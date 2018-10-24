package figure;

public class Cylinder extends Shape
{
    private Circle base;
    private Rectangle perimeters;

    public Cylinder(double radius, double height, int dimensions)
    {
        super(dimensions);
        this.base = new Circle(radius, dimensions);
        double perimeterBase = this.base.calculatePerimeter();
        this.perimeters = new Rectangle(perimeterBase, height, dimensions);
    }

    public double calculateArea()
    {
        return 2 * this.base.calculateArea() + this.perimeters.calculateArea();
    }
}
