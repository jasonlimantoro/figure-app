package figure;

public class Pyramid extends Shape
{
    private Triangle perimeters;
    private Rectangle base;

    public Pyramid(double perimeterHeight, double baseSide, int dimensions)
    {
        super(dimensions);
        this.base = new Rectangle(baseSide, baseSide, dimensions - 1);
        this.perimeters = new Triangle(perimeterHeight, baseSide, dimensions - 1);
    }

    public double calculateArea()
    {
        return 4 * perimeters.calculateArea() + base.calculateArea();
    }
}
