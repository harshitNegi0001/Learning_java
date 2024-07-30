import java.util.*;

public class Main {
	public static void main(String[] args) {
		LinkedList<Integer> l1= new LinkedList<>();
		LinkedList<Integer> l2= new LinkedList<>();
		
		
		l1.add(7); //method to add an element
		l1.add(60);
		l1.add(1,2);//method to add an element in a specific position
		l1.add(20);
		l1.remove(0); // remove element from specific position
		l2.add(30);
		l2.add(45);
		l2.add(62);
		
		
		l1.addAll(l2);//method to append all element from specific collection
		
		System.out.println("list 1 :");
		for(int item : l1){
			System.out.println(item);
		}
		
		
		
		System.out.println(l1.equals(l2)); // compare l1 and l2 for equality
		
		System.out.println("Head of the list : " + l1.peek()); //return head element of list
		
		
		System.out.println("Head of the list : " + l1.poll()); //return & remove head element of list
		
		
		System.out.println("after calling poll method list : " + l1);
		l1.clear(); //method to clear all element from the list
		
		
		
	}
}