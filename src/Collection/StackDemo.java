package Collection;
import java.util.*;

public class StackDemo {

	public static void main(String[] args) {
	Stack s = new Stack();
	 s.push("A");
	 s.push("B");
	 s.push("C");
	 System.out.println(s);
	 System.out.println(s.pop());
	 System.out.println(s);
	 System.out.println(s.peek());
	 System.out.println(s.empty());
	 System.out.println(s.search("A"));

	}

}
