
interface Shape
{
	double getArea();
}

class Rectangle78 implements Shape
{
	public double l;
	public double w;
	
	public Rectangle78(double l, double w)
	{
		this.w = w;
		this.l = l;
	}
	

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return l * w;
		
	}
	
}

class Circle78 implements Shape
{
	public double r;
	
	public Circle78(double r)
	{
		this.r = r;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 3.14 * r * r;
	}
	
}

class Triangle78 implements Shape
{
	public double b;
	public double h;

    public Triangle78(double b, double h)
    {
	this.b = b;
	this.h = h;
    }

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return b * h * 0.5;
	}
}


public class Shapezzzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle78 rec = new Rectangle78(4, 5);
		Circle78 cir = new Circle78(40);
		Triangle78 tri = new Triangle78(9, 7);
		
		 System.out.println("Rectangle Area: " + rec.getArea());
	        System.out.println("Circle Area: " + cir.getArea());
	        System.out.println("Triangle Area: " + tri.getArea());
	}

}
