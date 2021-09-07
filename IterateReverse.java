package project19;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateReverse {

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
		Iterator itr=list.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
