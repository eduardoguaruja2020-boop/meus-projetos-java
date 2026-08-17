package entities;

public class Student {
	public String name;
	public double t1;
	public double t2;
	public double t3;
	
	public double finalGrade() {
		return t1 + t2 + t3;
	}
	
	public void situation() {
		if(finalGrade() >= 60) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			double missing = 60 - finalGrade();
			System.out.printf("MISSING %.2f POINTS", missing);
		}
	}
}
