import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionHandling {
	public static void main(String[] args) {
		int[] marks={0,3,5,7,11,13,17,19,23,29};
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter index of marks array");
			int index = sc.nextInt();
			System.out.println("marks["+index+"] = "+marks[index]);
			System.out.println("Enter a number to divide marks[index] ");
			int num = sc.nextInt();
			
			System.out.println(marks[index]+" / "+num+" = "+(float)marks[index]/num);
		}
		
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Error! Array index out of bound. ");
		}
		catch(ArithmeticException e){
			System.out.println("Error! Arithmetic Exception occured ");
		}
		catch(InputMismatchException e){
			System.out.println("Error! input mismatch");
		}
		
		catch(Exception e){
			System.out.println(e);
		}
	}
}