package figure;

public class Cone extends Shape
{
    private Circle base;
    private double height;
    private double radius;

    public Cone (double radius, double height, int dimensions)
    {
        super(dimensions);
        this.base = new Circle(radius, dimensions);
        this.radius = radius;
        this.height = height;
    }

    public double calculateArea()
    {
        double slant = Math.sqrt(this.height * this.height + this.radius * this.radius);
        return base.calculateArea() + Math.PI * this.radius * slant;
    }
}
