//creatorvision

import java.util.*;

abstract class lib{
	
	 int id;
	 String title = new String();

	lib(int id ,String title)
	{
		this.id=id;
		this.title=title;
	}
	abstract void display ();
}

class printed extends lib{

	int n_pages;
	String categ;

	printed (int id, String title, int n_pages,String categ )
	{
		super(id,title);
		this.n_pages=n_pages;
		this.categ=categ;
		display();
	}

	void display()
	{
		System.out.println("Id = "+id);
		System.out.println("Title ="+title);
		System.out.println("No.of Pages= "+n_pages);
		System.out.println("Category ="+categ);
	}

}
class multimedia extends lib{

	double len;//in secounds
	String type;

	multimedia(int id, String title, double len,String type)
	{
		super(id,title);
		this.len=len;
		this.type=type;
		display();
	}

	void display()
	{
		System.out.println("Id = "+id);
		System.out.println("Title ="+title);
		System.out.println("Length of data = "+len);
		System.out.println("Category ="+type);
	}

}
class library{

	public static void main(String[] args) {
		
		multimedia m= new multimedia (2,"ABC_movie",390.4,"CD");
		printed p= new printed (3,"JAVA_book",600,"BOOK");

	}
}