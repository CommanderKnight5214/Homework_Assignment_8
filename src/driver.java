import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class driver 
{
	public static void main(String[] args)
	{
		BibleBookCollection theNewTestament = new BibleBookCollection("BookName.dat");
		try
		{
			BibleBook answer = theNewTestament.getFirstBookGivenSearchTerm("Christ");
			answer.display();
		}
		catch(Exception e)
		{
			System.out.println("No Book Found");
		}
		//Calling NamingSort and Chapter Sort and displaying them.
		//Error in calling them, can not covert to from biblebook to string
		String Name = theNewTestament.NameSort();
		String Chapter = theNewTestament.ChapterSort();
		System.out.println(Name);
		System.out.println(Chapter);
		
	}
}