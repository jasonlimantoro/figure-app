package figure;

public class Cuboid extends Shape
{
    private Rectangle side;
    private Rectangle top;
    private Rectangle front;

    public Cuboid(double length, double breadth, double height, int dimensions)
    {
        super(dimensions);
        this.side = new Rectangle(breadth, height, dimensions - 1);
        this.top = new Rectangle(length, breadth, dimensions - 1);
        this.front = new Rectangle(length, height, dimensions - 1);
    }

    public double calculateArea()
    {
        return 2 * side.calculateArea() + 2 * top.calculateArea() + 2 * front.calculateArea();
    }
}
