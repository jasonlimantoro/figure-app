package figure;

public class Circle extends Shape
{
    private double radius;
    private static final double PI = Math.PI;

    Circle(double radius, int dimensions)
    {
        super(dimensions);
        this.radius = radius;
    }

    public double calculateArea()
    {
        return PI * this.radius * this.radius;
    }
}
