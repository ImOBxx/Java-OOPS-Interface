

interface Resizable
{
	 double resizeWidth();
     double resizeHeight();
}

class Rectangle1 implements Resizable
{
	private int width;
	private int height;

	Rectangle1(int width, int height)
	{
		this.width = width;
		this.height = height;
	}

	@Override
	public double resizeWidth() {
		int resize = 5;
		this.width = this.width + resize;
		return this.width;
	}

	@Override
	public double resizeHeight() {
		int resize = 5;
		this.height = this.height + resize;
		return this.height;
	}
}


public class Rec4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle1 obj = new Rectangle1(4, 4);
		double newWidth = obj.resizeWidth();
	    double newHeight = obj.resizeHeight();
	        
	        // Print the resized dimensions
	    System.out.println("New Width: " + newWidth);
	    System.out.println("New Height: " + newHeight);
	}

}
