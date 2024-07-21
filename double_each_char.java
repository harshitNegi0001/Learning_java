public class Main {
	public static String doubleChar(String s){
		String newS="";
		for(int i=0;i<s.length();i++){
			newS+=s.charAt(i);
			newS+=s.charAt(i);
		}
		return newS;
	}
	public static void main(String[] args) {
		System.out.println("String = hello world!");
		System.out.println("after doubleChar : " + doubleChar("hello world!"));
	}
}