package project19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListAppendAtEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> list= new LinkedList<String>();
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
		list.addLast("Vijay");
		System.out.println("after appending at the end of the list");
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
