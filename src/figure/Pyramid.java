package figure;

public class Pyramid extends Shape
{
    private Triangle perimeters;
    private Rectangle base;

    public Pyramid(int dimensions, Triangle perimeters, Rectangle base)
    {
        super(dimensions);
        this.perimeters = perimeters;
        this.base = base;
    }

    public double calculateArea()
    {
        return 4 * perimeters.calculateArea() + base.calculateArea();
    }
}
