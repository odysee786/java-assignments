package net.bytequest.assignment1;
import java.util.Scanner;

/**
 * 
 * @author Uday
 *
 */
public class Fibanocci {

	public static void main(String[] args) {
		
		
		
		int StartNumber, SecondNumber, i = 1, j,ThirdNumber ;
		
		Scanner ui = new Scanner(System.in);
		
		System.out.println("Enter the start number for Fibanocci series: ");
		StartNumber = ui.nextInt();
		
		System.out.println("Enter the second number for Fibanocci series: ");
		SecondNumber = ui.nextInt();
		
		System.out.println("Enter the number of Fibanocci Series: ");
		j = ui.nextInt();
		
		
		
		int Total = StartNumber+SecondNumber;
		
		//String FibanocciSeries = StartNumber+", "+SecondNumber;
		
		
		
				
		do
		{
			
			ThirdNumber = StartNumber + SecondNumber;
			

			StartNumber = SecondNumber;
			
			SecondNumber = ThirdNumber;
			
			Total = Total + SecondNumber;
			/*System.out.println(Total);
			*/
			//FibanocciSeries = FibanocciSeries + ", "+ ThirdNumber;
			System.out.println(StartNumber);
			System.out.println(SecondNumber);
			
			
			i = i + 1;
			
		}while(i<=j);
		
		//System.out.println("The Fibanocci Series is: " + FibanocciSeries);
		
		System.out.println("The toal of FIbanocci Series is: "+ Total);

	}

}

