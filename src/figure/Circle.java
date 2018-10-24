package figure;

public class Circle extends Shape
{
    protected double radius;

    Circle(double radius, int dimensions)
    {
        super(dimensions);
        this.radius = radius;
    }

    public double calculateArea()
    {
        return Math.PI * this.radius * this.radius;
    }
}
