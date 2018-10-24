package figure;

public class Rectangle extends Shape
{
    private double length, breadth;

    public Rectangle(double length, double breadth, int dimensions)
    {
        super(dimensions);
        this.length = length;
        this.breadth = breadth;
    }
    public double calculateArea()
    {
        return this.length * this.breadth;
    }
}
