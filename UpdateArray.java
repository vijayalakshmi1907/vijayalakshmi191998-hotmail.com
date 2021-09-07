package project19;

import java.util.ArrayList;
import java.util.Iterator;

public class UpdateArray {

	public static void main(String[] args) {
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
		list.set(0, "purple");
		list.set(5,"black");
		
		System.out.println("After Updation");
		
		Iterator it=list.iterator();

		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		// TODO Auto-generated method stub

	}

}
