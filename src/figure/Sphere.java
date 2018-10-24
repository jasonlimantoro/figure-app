package figure;

public class Sphere extends Circle
{
    public Sphere(double radius, int dimensions)
    {
        super(radius, dimensions);
    }

    public double calculateArea()
    {
        return 4 * Math.PI * this.radius * this.radius;
    }
}

