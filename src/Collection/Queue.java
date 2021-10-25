package Collection;
import java.util.*;

public class Queue {

	public static void main(String[] args) {
		PriorityQueue<String> q = new PriorityQueue<String>();
		
	q.offer("A");
	q.offer("B");
	q.offer("C");
	q.offer("D");
	q.offer("E");
	System.out.println("head:"+q.peek());
	System.out.println("head:"+q.element());
	Iterator itr = q.iterator();
	while(itr.hasNext()) {
		String s = (String)itr.next();
		System.out.println(s);
	}
	System.out.println("delete"+q.poll());
	System.out.println("delete"+q.remove());
	 Iterator itr2 = q.iterator();
	 while(itr2.hasNext()) {
		 String s2 =(String)itr2.next();
		 System.out.println(s2);
	 }
	}

}
