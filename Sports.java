
interface Playable
{
	void play();
}

class Football implements Playable
{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing Football.");
	}
	
}

class Volleyball implements Playable
{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing Volleyball.");
		
	}
	
}

class Basketball implements Playable
{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing Basketball.");
		
	}
	
}


public class Sports {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Football obj = new Football();
		Volleyball obj1 = new Volleyball();
		Basketball obj2 = new Basketball();
		
		obj.play();
		obj1.play();
		obj2.play();
		

	}

}
