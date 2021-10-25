package Collection;

import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(97);
		l.add("java");
		l.add('a');
		l.add(null);
		System.out.println(l);
		l.set(2, 94);
		l.removeLast();
		l.addFirst("neha");
		System.out.println(l.getLast());
		System.out.println(l);
		
		

	}

	}


