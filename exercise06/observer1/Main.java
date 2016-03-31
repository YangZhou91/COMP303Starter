package observer1;

public class Main
{
	public static void main(String[] args)
	{
		Player myDog = new Player("ScoobyDoo");
		myDog.addObserver(new SoundEffectController());
		myDog.addObserver(new LightEffectController());

		myDog.moveForward(2);
		System.out.println("Nothing yet.");

		myDog.moveBackward(3);
		System.out.println("Nothing yet.");

		myDog.moveForward(7);
		myDog.jump(3);
	}
}
