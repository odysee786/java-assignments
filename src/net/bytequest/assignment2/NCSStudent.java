package net.bytequest.assignment2;

public class NCSStudent extends Pass {

	public static void main(String[] args) {
		
		NCSStudent student2 = new NCSStudent();

		student2.studentDisplay();
		System.out.println("%n");
		student2.fun();

	}
	
	public void pass()
	
	{
		
		System.out.println("Non Computer science students must have 4 ticks to pass ");
		
		
	}
	
	public void fun()
	
	{
		
		System.out.println("Non Computer Science students have lot of time to party");
		
	}

}
