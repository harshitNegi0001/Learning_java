class NegativeAreaException extends Exception{
	@Override
	public String toString(){
		return "Negative value occurs";
	}
	@Override
	public String getMessage(){
		return "cannot enter negative value";
	}
}

public class Throw_Throws {
	
	
	public static int divide(int a, int b)throws ArithmeticException{
		
		return a/b;
		
	}
	public static int squareArea(int a)throws NegativeAreaException{
		if(a<0){
			throw new NegativeAreaException();
		}
		return a*a;
		
	}
	public static void main(String[] args) {
		try{
			int a=12;
			int b=0;
			System.out.println(divide(a,b));
		}
		catch(Exception e){
			System.out.println("Arithmetic Exception");
		}
		
		try{
		System.out.println("area of square is "+squareArea(-1));
		}
		catch(Exception e){
			System.out.println(e+"\n"+e.getMessage());
		}
	}
}