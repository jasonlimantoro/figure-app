package figure;

public class Cuboid extends Shape
{
    protected Rectangle side;
    protected Rectangle top;
    protected Rectangle front;

    public Cuboid(Rectangle side, Rectangle top, Rectangle front, int dimensions)
    {
        super(dimensions);
        this.side = side;
        this.top = top;
        this.front = front;
    }

    @Override
    public double calculateArea()
    {
        return 2 * side.calculateArea() + 2 * top.calculateArea() + 2 * front.calculateArea();
    }
}
