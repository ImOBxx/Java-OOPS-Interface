
interface Drawable
{
	void draw();
}

class Circle implements Drawable
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
	
}

class Rectangle implements Drawable
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
	
}

class Triangle implements Drawable
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
	
}


public class Draw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj = new Circle();
		Rectangle obj1 = new Rectangle();
		Triangle obj2 = new Triangle();
		
		obj.draw();
		obj1.draw();
		obj2.draw();
		
		

	}

}
