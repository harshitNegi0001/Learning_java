import java.util.*;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> arrl1= new ArrayList<>(10);
		ArrayList<Integer> arrl2= new ArrayList<>();
		
		
		arrl1.add(7); //method to add an element
		arrl1.add(60);
		arrl1.add(1,2);//method to add an element in a specific position
		arrl1.add(20);
		arrl1.remove(0); // remove element from specific position
		arrl2.add(30);
		arrl2.add(45);
		arrl2.add(62);
		
		
		arrl1.addAll(arrl2);//method to append all element from specific collection
		for(int i=0;i<arrl1.size();i++){
			
			System.out.println(arrl1.get(i));
			//method to get element at the specific position
		}
		
		System.out.println("position of 20 in arraylist = "+(arrl1.indexOf(20)+1));
		
		System.out.println(arrl1.equals(arrl2)); // compare arrl1 and arrl2 for equality
		
		arrl1.clear(); //method to clear all element from the list
		
		
	}
}