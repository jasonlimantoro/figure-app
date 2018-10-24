package figure;

import java.util.ArrayList;
import java.util.Scanner;

public class Shape3DApp
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
    		System.out.println("4. Sphere");
    		System.out.println("5. Square-based pyramid");
    		System.out.println("6. Cuboid");
    		System.out.println("7. Cone");
    		System.out.println("8. Cylinder");
    		System.out.print("Please choose the shapes(1 - 8): ");
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
    		else if(op==4)
    		{
    			System.out.print("Enter radius: ");
    			int r=sc.nextInt();
    			System.out.print("Enter dimension: ");
    			int d=sc.nextInt();
    			shapes.add(new Sphere(r,d));
    		}
    		else if(op==5)
    		{
    			System.out.print("Enter triangle height: ");
    			int h=sc.nextInt();
    			System.out.print("Enter base length: ");
    			int l=sc.nextInt();
    			System.out.print("Enter dimension: ");
    			int d=sc.nextInt();
    			shapes.add(new Pyramid(new Triangle(h,l,d-1), new Rectangle(l,l,d-1), d));
    		}
    		else if(op==6)
    		{
    			System.out.print("Enter length: ");
    			int l=sc.nextInt();
    			System.out.print("Enter breadth: ");
    			int b=sc.nextInt();
    			System.out.print("Enter height: ");
    			int h=sc.nextInt();
    			System.out.print("Enter dimension: ");
    			int d=sc.nextInt();
    			shapes.add(new Cuboid(new Rectangle(l,b,d-1), new Rectangle(b,h,d-1),new Rectangle(l,h,d-1),d));
    		}
    		else if(op==7)
    		{
    			System.out.print("Enter radius: ");
    			int r=sc.nextInt();
    			System.out.print("Enter height: ");
    			int h=sc.nextInt();
    			System.out.print("Enter dimension: ");
    			int d=sc.nextInt();
    			shapes.add(new Cone(r,h,d));
    		}
    		else if(op==8)
    		{
    			System.out.print("Enter radius: ");
    			int r=sc.nextInt();
    			System.out.print("Enter height: ");
    			int h=sc.nextInt();
    			System.out.print("Enter dimension: ");
    			int d=sc.nextInt();
    			shapes.add(new Cylinder(r,h,d));
    		}
    		
    		totalArea+=shapes.get(x).calculateArea();
    	}
    	System.out.println("Calculated area of 3D figure: "+totalArea);
    	
    }
}

/*
Test case example:
3
4 10 3
5 10 20 3
6 10 20 30 3

Ans: 1256.637(4*PI*10*10) + 800(20*20+4*10*20/2) + 2200(10*20*2+10*30*2+20*30*2) = 4256.637

2 
7 10 10 3
8 10 10 3

Ans: 758.448(10*10*pi) +1256.64(10*10*pi+10*10*2*pi) =1570.7963
*/
