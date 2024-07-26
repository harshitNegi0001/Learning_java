import java.util.Scanner;

public class Try_Catch {
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		
		try{
			System.out.println("Enter the value of a : ");
			a=sc.nextInt();
			System.out.println("Enter the value of b : ");
			b=sc.nextInt();
			System.out.println(" a / b = "+a/b);
		}
		catch (Exception e){
			System.out.println(e);
		}
		
	}
}