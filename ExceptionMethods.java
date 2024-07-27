import java.util.Scanner;

class WrongAgeException extends Exception{
	@Override
	public String toString(){
		return "Age can not be negative and should between 18 and 60 .";
		
	}
	@Override
	public String getMessage(){
		return "Wrong age";
	}
}

public class ExceptionMethod {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Hello employee...\nEnter your Id");
		try{
			int name = sc.nextInt();
			System.out.println("Enter your age ");
			
			int age = sc.nextInt();
			if(age<18||age>60){
				try{
					throw new WrongAgeException();
				}
				catch(Exception e){
					System.out.println(e.toString());
					System.out.println(e.getMessage());
					e.printStackTrace(); 
				
				}
			}
			else {
				System.out.print("your data is submitted");
			}
			
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}