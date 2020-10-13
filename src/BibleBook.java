public class BibleBook extends Object
{
	private String name;
	private int number_of_chapters;
	private String summary;
	
	public BibleBook(String name, int number_of_chapters, String summary)
	{
		this.name = name;
		this.number_of_chapters = number_of_chapters;
		this.summary = summary;
	}
	
	public BibleBook(String s)
	{
		String[] parts = s.split(":");
		this.name = parts[0];
		this.number_of_chapters = Integer.parseInt(parts[1]);
		this.summary = parts[2];
	}
	
	//return true if the searchTerm is found in this books summary and false otherwise
	public boolean searchSummary(String searchTerm)
	{
		return this.summary.toLowerCase().indexOf(searchTerm.toLowerCase()) != -1;
	}
	
	//Sorts the name of the book.
	//Error in variable passing
	public void sortOnName(BibleBook) 
    { 
		//For the length of biblebook and going back through each bucket
		String n = BibleBook.this.name.length();
		for(int i = BibleBook.this.name.length() -1; i >= 0; i++);
		{
			for (int j = 0; j < n-i-1; j++)
			{
				//Establishing vairbles and compare the two variables
				String FN = BibleBook.this.name.charAt[i];
				String SN = BibleBook.this.name.charAt[i + s];
				int NameComp = (FN).compareTo(SN);
				//If NameComp < 0 then swap the varibles.
				if (NameComp < 0);
				{
					String Temp = FN;
					FN = SN;
					SN = Temp;
				}
			}
			
		}
		//returns BibleBook
		return BibleBook;
		/*
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                    // swap arr[j+1] and arr[j] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
        */
    }
	public void sortOnChapter(BibleBook)
	{
		//Establishes intial variable and calculates the length of biblebook.
		int n = BibleBook;
		for(int i = BibleBook.this.number_of_chapters().length() -1; i >= 0; i++);
		{
			//Goes back in each bucket minus one
			for (int j = 0; j < n-i-1; j++)
			{
				//If the biblebook at bucket j is greater than j+1 than swap. 
				if (BibleBook.this.number_of_chapters[j] > BibleBook.this.number_of_chapters[j+1]) 
                { 
                    // swap arr[j+1] and arr[j] 
                    int temp = BibleBook[j]; 
                    BibleBook[j] = BibleBook[j+1]; 
                    BibleBook[j+1] = temp; 
                } 
			}
			
		}
		return BibleBook;
	}
	
	public int getNumber_of_chapters() 
	{
		return number_of_chapters;
	}

	public String getSummary() 
	{
		return summary;
	}

	public String getName()
	{
		return this.name;
	}
	
	public void setName(String newName)
	{
		if(newName.length() >= 5)
		{
			this.name = newName;
		}
	}
	
	public void display()
	{
		System.out.println("Book Name: " + this.name + 
				"(" + this.number_of_chapters + " chapters) - " + this.summary);
	}
}
