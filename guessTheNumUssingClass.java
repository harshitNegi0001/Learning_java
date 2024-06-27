import java.util.Scanner;
import java.util.Random;

class Game {
	int guessNum;
	int countGuesses;
	int number;
	
	public Game(){
		countGuesses=0;
		Random num = new Random();
		number=num.nextInt(100);
		System.out.println(number);
		
	}
	
	public void userInput(){
		
		Scanner s1= new Scanner(System.in);
		guessNum=s1.nextInt();
		countGuesses++;
		
	}
	public boolean checkGuess(){
		if(this.number==this.guessNum){
			System.out.println("you guess the number correctly in "+countGuesses+" guesses .");
			return true;
		}
		else if (this.number<this.guessNum){
			System.out.println("you guess bigger number , guess a small number.");
		}
		else{
			System.out.println("you guess smaller number , guess a big number.");
		}
		return false;
	}
	
}

public class Main {
	public static void main(String[] args) {
		Game g1=new Game();
		g1.userInput();
		while(g1.checkGuess()!=true){
			g1.userInput();
		}
		
	}
}