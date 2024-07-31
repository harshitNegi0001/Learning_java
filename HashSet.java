import java.util.*;
public class HashSet_practice {
	public static void main(String[] args) {
		HashSet <Integer> hs1= new HashSet<>(10,0.6f);//initial capacity (10) , load factor(0.6)
	
		HashSet <Integer> hs2= new HashSet<>();//initial capacity(16) , load factor(0.75);
		hs1.add(15);
		hs1.add(78);
		hs1.add(18);
		hs1.add(18);// hashset can not contain duplicates and return false
		hs1.add(20);
		System.out.println("Hashset 1 : "+hs1+"\nand size = "+hs1.size());
		
		
		hs2.add(25);
		hs2.add(28);
		hs2.add(48);
		hs2.add(98);
		hs2.add(100);
		System.out.println("Hashset 2 : "+hs2+"\nand size = "+hs2.size());
		
		hs1.clear();
		System.out.println("checking hashset 1 is empty , result = "+hs1.isEmpty());
		
	}
}