import java.util.LinkedList;
import java.util.ListIterator;
import java.io.Serializable;
import java.util.RandomAccess;

public class LinkedListDemo {

	public static void main(String[] args) {
//		LinkedList l = new LinkedList();
//		l.add("Sam");
//		l.add(40);
//		l.add(null);
//		l.add(50);
//		
//		System.out.println();
//		
//		l.set(0,"Ruchi");
//		System.out.println(l);
//		
//		l.removeLast();
//		System.out.println(l);
//		
//		l.addFirst(50);
//		System.out.println(l);
//		
//		System.out.println(l instanceof Serializable);
//		System.out.println(l instanceof Cloneable);
//		System.out.println(l instanceof RandomAccess);
		
		
		LinkedList<String> l = new LinkedList<String>();
		l.add("Sam");
		l.add("Ruchi");
		l.add("Vishal");
		l.add("Aniket");
		
		System.out.println(l);
		
		ListIterator<String> itr = l.listIterator();
		while(itr.hasNext())
		{
			String str = itr.next();
			
			if(str.equals("Sam"))
			{
				itr.set("Priya");
			}
			if(str.equals("Ruchi"))
			{
				itr.set("Kiran");
			}
		}
		
		System.out.println(l);
	}

}
