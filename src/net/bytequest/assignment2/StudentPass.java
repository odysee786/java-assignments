package net.bytequest.assignment2;
/**
 * 
 * @author Uday
 *
 */
public class StudentPass {

	public static void main(String[] args) {

      Student student1 = new Student(); // Main student object
      CSStudent csstudent2 = new CSStudent(); // computer science student inherit student object and uses abstract method pass
      NCSStudent ncsstudent1 = new NCSStudent(); // non computer science student inherit student object and uses abstract method pass
      
      student1.fun();                  // display main student object function
      
		csstudent2.name = "Jame";
		csstudent2.id = "2017CS1233";
		csstudent2.gpa = 3.8;
      
		ncsstudent1.name = "John";
		ncsstudent1.id = "2016BI456";
		ncsstudent1.gpa = 3.9;
		
      csstudent2.studentDisplay(); 
      csstudent2.pass();             // abstract pass method specific to computer science students      
      Merry(csstudent2);             // Main method student.fun object specific to computer science students
      
      ncsstudent1.studentDisplay();
      ncsstudent1.pass();            // abstract pass method specific to non computer science students
      Merry(ncsstudent1);            // Main method student.fun object specific to non computer science students
      

	}

	public static void Merry(Student student2)
	
	{
		
		student2.fun();
		
	}
}
