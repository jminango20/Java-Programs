package entities;

public class Student {
	
	public String name;
	public double grade1,grade2,grade3;
	
	public double promedio() {
		return grade1 + grade2 + grade3;
	}
	
	public double missingPoint() {
		if (promedio() < 60.0) {
			return 60.0 - promedio();
		}
		else {
			return 0;
		}
	}

}
