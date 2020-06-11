package Task3;

public class Main {
	public static void main(String[] args) {
			
			Frog f = new Frog();
			Amphibia frog = (Amphibia)f; // Amphibia frog = new Frog();
			
			frog.toEat();
			frog.toSleep();
			frog.toSwim();
			frog.toWalk();
		}
}
