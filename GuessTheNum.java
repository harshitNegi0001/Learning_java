import java.util.Scanner;
import java.util.Random;


public class GuessTheNumber {
	public static void main(String[] args) {
		Random random= new Random();
		int num=random.nextInt(100)+1;
		int attempts=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Guess the number (1 to 100) : ");
		while(true){
			int guess=sc.nextInt();
			attempts++;
			if(guess==num){
				System.out.println("Congratulation ! you guess correct in " +attempts+ " attempts .");
				break;
				
			}
			else if (guess>num){
				System.out.println("Your guess is bigger than number , guess a smaller number than you guess");
			}
			else{
				System.out.println("Your guess is smaller than number , guess a bigger number than you guess");
			}
		}
		sc.close();
		
	}
}