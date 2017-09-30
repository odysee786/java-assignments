package net.bytequest.assignment3;
import java.util.Comparator;
public class Author {
	
	int age;
	int NoOfBooks;
	String name;	
	String nameandbooks = age+"-"+name;
	
	public Author (int age, int NoOfBooks, String name)
	
	{
		this.age = age;
		this.NoOfBooks = NoOfBooks;
		this.name = name;
	
		
	}
	
	public int getBooks()
	
	{
		return NoOfBooks;
	}
	
	public String getName()
	
	{
		
		return name;
	}
	
	public String getNameAndBooks()
	
	{
		return nameandbooks;
	}

	public static Comparator<Author> BookNo = new Comparator<Author>()
			
			{
		       public int compare(Author A1, Author A2)
		       
		       {
		    	   
		    	   int Books1 = A1.getBooks();
		    	   int Books2 = A2.getBooks();
		    	   
		    	   return Books1 - Books2;
		    	   
		       }
		
			};
			
			
	public static Comparator<Author> AuthorName = new Comparator<Author>()
			
			{
		       public int compare(Author A1, Author A2)
		       
		       {
		    	   
		    	   String Name1 = A1.getName();
		    	   String Name2 = A2.getName();
		    	   
		    	   return Name1.compareTo(Name2);
		    	   
		       }
		
			};
			
	public static Comparator<Author> BookName = new Comparator<Author>()
			
			{
		       public int compare(Author A1, Author A2)
		       
		       {
		    	   
		    	   String Name1 = A1.getNameAndBooks();
		    	   String Name2 = A2.getNameAndBooks();
		    	   
		    	   return Name1.compareTo(Name2);
		    	   
		       }
		
			};
			
	public String toString()
	
	{
		
		return "The Author "+name+" at the age of "+age+" published "+NoOfBooks+" Books";
	}
	
}

