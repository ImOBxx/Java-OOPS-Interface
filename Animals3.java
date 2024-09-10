
interface Animal
{
	void bark();
}

class Dog implements Animal
{
	void speak()
	{
		System.out.println("Dog Is Barking");
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		
	}
}


public class Animals3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog obj = new Dog();
		obj.speak();
		obj.bark();
		

	}

}
