public class Recursion_practice {
	static int factorial(int n){
		if(n==1){
			return 1;
		}
		
		return factorial(n-1)*n;
		
	}
	static int fibonacci (int term){
		
		if(term==1){
			return 0;
		}
		else if (term==2){
			return 1;
		}
		else{
			return fibonacci(term-2) + fibonacci(term-1);
		}
	}
	public static void main(String[] args) {
		//System.out.println(factorial(4));
		
		System.out.println(fibonacci(7));
	}
}