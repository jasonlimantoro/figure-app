package figure;

public class Triangle extends Shape
{
    private double height, base;

    public Triangle(double height, double base, int dimensions)
    {
        super(dimensions);
        this.height = height;
        this.base = base;
    }

    public double calculateArea()
    {
        return 0.5 * height * base;
    }
}
