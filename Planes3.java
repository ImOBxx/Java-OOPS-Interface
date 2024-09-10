
interface Flyable
{
	void fly_obj();
}

class Spacecraft implements Flyable
{

	@Override
	public void fly_obj() {
		// TODO Auto-generated method stub
		System.out.println("Spacecraft use Rocket Fuel.");
		
	}
	
}

class Airplane implements Flyable
{

	@Override
	public void fly_obj() {
		// TODO Auto-generated method stub
		System.out.println("Airplanes use Jet Fuel.");
		
	}
	
}

class Helicopter implements Flyable
{

	@Override
	public void fly_obj() {
		// TODO Auto-generated method stub
		System.out.println("Helicopters use Jet Fuel.");
		
	}
	
}


public class Planes3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Spacecraft obj = new Spacecraft();
		Airplane obj1 = new Airplane();
		Helicopter obj2 = new Helicopter();
		
		obj.fly_obj();
		obj1.fly_obj();
		obj2.fly_obj();

	}

}
