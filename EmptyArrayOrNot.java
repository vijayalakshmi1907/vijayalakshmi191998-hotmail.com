package project19;

import java.util.ArrayList;
import java.util.Iterator;

public class EmptyArrayOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> list= new ArrayList<String>();
		ArrayList <String> lis= new ArrayList<String>();
		
		list.add("Red");
		list.add("blue");
		list.add("orange");
		list.add("pink");
		list.add("green");
		list.add("Yellow");
		list.add("White");
		Iterator itr=list.iterator();
		
		boolean ans=list.isEmpty();
		if(ans==true)
		{
			System.out.println("the array 1 is empty");
		}
		else
		{
			System.out.println("the array1 is not empty");
		}
		boolean an=lis.isEmpty();
		
		if(an==true)
		{
			System.out.println("the array 2 is empty");
		}
		else
		{
			System.out.println("the array2 is  not empty");
		}
		
	}

}
