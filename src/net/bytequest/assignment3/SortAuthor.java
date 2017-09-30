package net.bytequest.assignment3;
import java.util.*;

public class SortAuthor {

	public static void main(String[] args) {
		
		ArrayList<Author> arrList = new ArrayList<Author>();
		
		arrList.add(new Author(29,6,"Jame"));
		arrList.add(new Author(28,7,"Zack"));
		arrList.add(new Author(32,7, "Charles"));
		
		System.out.println("Sorting by number of books published: ");
		
		Collections.sort(arrList, Author.BookNo);
		
		for(Author str: arrList)
		{
			
			System.out.println(str);
		}

		System.out.println(" Sorting by Author name: ");
		
		Collections.sort(arrList, Author.AuthorName);
		
		for(Author str2: arrList)
		{
			
			System.out.println(str2);
		}		
		
		System.out.println("Sort by number of books published and Author name: ");
		
		Collections.sort(arrList, Author.AuthorName);
		
		for(Author str3: arrList)
		{
			
			System.out.println(str3);
		}
		
	}

}
