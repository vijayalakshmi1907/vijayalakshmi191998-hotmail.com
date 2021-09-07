package project19;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList <String> list= new ArrayList<String>();
	list.add("Red");
	list.add("blue");
	list.add("orange");
	list.add("pink");
	list.add("green");
	list.add("Yellow");
	list.add("White");
	Iterator itr=list.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	
	
	
	
	}

}
