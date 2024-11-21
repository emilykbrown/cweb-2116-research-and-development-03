package astraction;

public abstract class ABC {
	ABC() {
		System.out.println("Initializing ABC Class");
	}
	
	void FOO() {
		System.out.println("FOO");
	}
	
	abstract String DAY();
}
