import java.util.*;

public class ArrayDequePractice {
	public static void main(String[] args) {
		ArrayDeque <Integer> ad1= new ArrayDeque<>();
		
		ad1.add(50); // insert element at the end of deque
		ad1.add(12);
		ad1.add(65);
		ad1.addFirst(71);//insert at the front of deque
		ad1.add(34);
		ad1.addFirst(100);
		ad1.removeFirst();
		System.out.println("Deque :\n"+ad1);
		
		System.out.println("Size of Deque = "+ad1.size());
		System.out.println("calling poll method :\n"+ad1.poll());//return and remove first element
		
		System.out.println("Deque clone :\n"+ad1.clone());
		
		ad1.clear();
		System.out.println("after calling clear method - \nDeque :\n"+ad1);
		
	}
}