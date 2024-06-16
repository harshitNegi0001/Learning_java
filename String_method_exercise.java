import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your String : ");
		String str1=sc.nextLine();
		//toLowerCase
		System.out.println("Your entered String in lower case : "+str1.toLowerCase());
		//toUpperCase
		System.out.println("Your entered String in upper case : "+str1.toUpperCase());
		//strip
		System.out.println("Your entered String after strip: "+str1.strip());
		//replace
		System.out.println("Your entered String after replacing some word : "+str1.replace(' ','_'));
		//trim
		
		System.out.println("Your entered String after trim :  "+str1.trim());
		//indexOf
		System.out.println(str1.indexOf('a',2));	
	}
	
}