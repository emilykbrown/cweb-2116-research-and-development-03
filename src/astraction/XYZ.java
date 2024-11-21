package astraction;

public class XYZ extends ABC {
	@Override
	String DAY() {
		return "THURSDAY";
	}

	String DAY(String greeting) {
		return greeting + " THURSDAY";
	}
}
