

interface Shapes
{
	double getArea();
}

class Circle implements Shapes
{
	double r;
	Circle(double r)
	{
		this.r = r;
	}
	public double getArea()
	{
		return 3.14 * r * r;
	}
}

class Rectangle
{
	double l;
	double b;
	Rectangle(double l, double b)
	{
		this.l = l;
		this.b = b;
	}
	public double getArea()
	{
		return l * b;
	}
}

class Triangle
{
	double a;
	Triangle(double a)
	{
		this.a = a;
	}
	public double getArea()
	{
		return a * a * a;
	}
}





public class Shapes3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj = new Circle(4);
		Rectangle obj1 = new Rectangle(4, 4);
		Triangle obj2 = new Triangle(4);
		System.out.println("Circle Area: " + obj.getArea());
        System.out.println("Rectangle Area: " + obj1.getArea());
        System.out.println("Triangle Area: " + obj2.getArea());
    }
		

	}


