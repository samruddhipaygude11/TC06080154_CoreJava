// package Assignment;

import java.util.*;
import java.io.Serializable;
import java.util.RandomAccess;

public class LinkedList {
	
	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		l.add("Sam");
		l.add(40);
		l.add(null);
		l.add(50);
		
		System.out.println();
		
		l.set(0,"Ruchi");
		System.out.println(l);
		
		l.removeLast();
		System.out.println(l);
		
		l.addFirst(50);
		System.out.println(l);
		
		System.out.println(l instanceof Serialization);
		System.out.println(l instanceof Cloneable);
		System.out.println(l instanceof RandomAccess);
		
	}
	
}
