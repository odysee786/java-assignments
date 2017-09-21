package net.bytequest.assignment2;

public class CSStudent extends Pass {

	public static void main(String[] args) {
		
		CSStudent student1 = new CSStudent();
		student1.studentDisplay();
		System.out.println("%n");
		student1.fun();


	}
	
	public void pass()
	
	{
		
		System.out.println("Computer science students must have 6 ticks to pass ");
		
		
	}
	
	public void fun()
	
	{
		
		System.out.println("Computer Science students can't party too much");
		
	}

}
