package figure;

public class Cone extends Shape
{
    private Circle base;
    private double slant;
    private double height;
    private double radius;

    public Cone (double radius, double height, int dimensions)
    {
        super(dimensions);
        this.base = new Circle(radius, dimensions);
        this.radius = radius;
        this.height = height;
        this.slant = Math.sqrt(Math.pow(this.height, 2) + Math.pow(this.radius, 2));
    }

    public double calculateArea()
    {
        return base.calculateArea() + Math.PI * this.radius * this.slant;
    }
}
