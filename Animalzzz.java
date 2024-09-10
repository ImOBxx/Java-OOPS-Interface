
interface Animal39
{
     void bark();
}

class Dog39 implements Animal39
{

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("Dog is Barking");
		
	}
	
}

public class Animalzzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Dog39 dg = new Dog39();
        dg.bark();
	}
}
