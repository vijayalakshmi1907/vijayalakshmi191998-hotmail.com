package project19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class RevereseArray {

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
		Collections.reverse(list);
		System.out.println("After reversing");
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
