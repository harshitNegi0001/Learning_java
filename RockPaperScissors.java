import java.util.Random;
import java.util.Scanner;
public class RockPaperScissor{
	public static int whoWin(char com, char user){
		if((com=='r' && user=='s')||(com=='s'&& user=='p')||(com=='p'&& user=='r')){
			return 0;
		}
		else if(com==user){
			return 2;
		}
		else {
			return 1;
		}
	}
	public static char userChoice(){
		Scanner sc= new Scanner(System.in);
		String user= sc.next();
		
		if(user.startsWith("r")||user.startsWith("R")){
			System.out.println("You entered Rock");
			return 'r';
		}
	
		else if(user.startsWith("s")|| user.startsWith("S")){
			System.out.println("You entered Scissor");
			return 's';
		}
		
		else if(user.startsWith("p")||user.startsWith("P")){
			System.out.println("You entered Paper");
			return 'p';
		}
		
		else {
			System.out.print("Please select from 'stone','paper' or 'scissor'");
			return userChoice();
		}
	}
	public static char comChoice(){
		Random random=new Random();
		int rnum= random.nextInt(9);
		if(rnum<3){
			System.out.println("Computer choosed Rock");
			return 'r';
		}
		else if(rnum<6){
			System.out.println("Computer choosed Paper");
			return 'p';
		}
		else{
			System.out.println("Computer choosed scissor ");
			return 's';
		}
	}
		
	
	public static void main(String[] args){
		char com,user;
		
		user=userChoice();
		com=comChoice();
		int win;
		win=whoWin(com,user);
		if(win==0){
			System.out.print("Computer Win");
		}
		else if(win==1){
			System.out.print("You Win");
		}
		else{
			System.out.print("Draw !");
		}
	}
}