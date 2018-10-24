package figure;

import java.util.ArrayList;
import java.util.Scanner;

public class Shape2DApp
{
    public static void main(String [] args)
    {
    	Scanner sc= new Scanner(System.in);
    	System.out.print("Enter number of shapes: ");
    	int num_shapes= sc.nextInt();
    	ArrayList <Shape> shapes = new ArrayList<>();
    	double totalArea=0;
    	for(int x=0;x<num_shapes;x++)
    	{
    		System.out.println("Shapes available: ");
    		System.out.println("1. Circle");
    		System.out.println("2. Triangle");
    		System.out.println("3. Rectangle");
    		System.out.print("Please choose the shapes(1-3): ");
    		int op=sc.nextInt();
    		if(op==1)
    		{
    			System.out.print("Enter radius: ");
    			int r=sc.nextInt();
    			System.out.print("Enter dimension: ");
    			int d=sc.nextInt();
    			shapes.add(new Circle(r,d));
    		}
    		else if(op==2)
    		{
    			System.out.print("Enter height: ");
    			int h=sc.nextInt();
    			System.out.print("Enter base length: ");
    			int l=sc.nextInt();
    			System.out.print("Enter dimension: ");
    			int d=sc.nextInt();
    			shapes.add(new Triangle(h,l,d));
    		}
    		else if(op==3)
    		{
    			System.out.print("Enter length: ");
    			int l=sc.nextInt();
    			System.out.print("Enter breadth: ");
    			int b=sc.nextInt();
    			System.out.print("Enter dimension: ");
    			int d=sc.nextInt();
    			shapes.add(new Rectangle(l,b,d));
    		}
    		totalArea+=shapes.get(x).calculateArea();
    	}
    	System.out.println("Calculated area of 2D figure: "+totalArea);
    	
    }
}

/*
Test case example:
3
1 10 2
2 25 20 2
3 50 20 2

314+ 250+ 1000
*/
