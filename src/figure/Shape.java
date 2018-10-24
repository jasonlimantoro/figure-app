package figure;

public abstract class Shape
{
    public double area;
    public int dimensions;

    public Shape(int dimensions) {
        this.dimensions = dimensions;
    }
    abstract public double calculateArea();
}
