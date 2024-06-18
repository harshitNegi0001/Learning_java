import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter terms to print fabonacci series (note- enter number greater than 2)");
		int n= sc.nextInt();
		int t1=0, t2=1;
		int t3;
		int term=2;
		System.out.print("Fabonacci series : \n "+t1+" , " +t2);
			
		while(term<n){
			t3=t1+t2;
			System.out.print(" , "+t3);
			t1=t2;
			t2=t3;
			term++;
			
		}
	}
}