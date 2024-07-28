import java.util.Scanner;
import java.util.InputMismatchException;
public class FinallyBlock{
	public static void operation1() {
		Scanner sc = new Scanner(System.in);
		try{
			try{
				System.out.print("Enter numerator : ");
				int a= sc.nextInt();
				System.out.print("Enter denominator : ");
				int b=sc.nextInt();
				try{
					System.out.println("Result = "+a/b);
					}	
				catch(ArithmeticException e3){
					System.out.println("Caught an ArithmeticException --> Cannot divide by zero ");
				}
				
			}
			catch(InputMismatchException e2){
				System.out.println("Caught an InputMismatchException --> Enter integer only ");
			}
				
		}
		catch(Exception e1){
			System.out.println("caught a "+e1);
		}
		finally{
			System.out.println("Opration completed");
			sc.close();
			return;
		}
	}
	
	public static void main(String[] args){
		operation1();
		
	}
}