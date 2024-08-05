class C1{
	int a=2;//default 
	public int b= 10; //public
	private int c= 12;//private
	protected int d=30;//protected
	public void printValue(){
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	
}
class C2 extends C1{
	public void printSuperClassValues(){
		System.out.println(a);
		System.out.println(b);
		//System.out.println(c);//can not access because private can be access only form its own class
		System.out.println(d);
	}
}
public class Access_Modifier {
	public static void main(String[] args) {
		C1 c1=new C1();
	/*	System.out.println(c1.a);// will run
		
		System.out.println(c1.b);// will run
		//System.out.println(c1.c);// this will throw error because this is protected
		System.out.println(c1.d);//will run
	*/
	
		c1.printValue();
		
		C2 c2= new C2();
		c2.printSuperClassValues();
	}
}