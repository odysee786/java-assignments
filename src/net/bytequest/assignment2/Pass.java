package net.bytequest.assignment2;

public abstract class Pass extends Student {
	
	public abstract void pass();
	
	public void studentDisplay()
	
	{
		
		System.out.printf("The student name is %s.%nStudent ID is %s. %nFinal GPA is %4.3f%n", name, id, gpa);
		
	}

}
