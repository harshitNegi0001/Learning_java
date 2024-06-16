import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks : ");
		int m1=sc.nextInt();
		
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		int m4=sc.nextInt();
		int m5=sc.nextInt();
		float pr=(m1+m2+m3+m4+m5)*100/500;
		System.out.print(pr);
		System.out.print("%");
	}
}