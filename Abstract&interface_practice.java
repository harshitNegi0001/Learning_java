abstract class Pen{
	
	abstract void write();
	abstract void refill();
	
}
 
class FountainPen extends Pen {
	public void write(){
		System.out.println("Writing...");
	}
	public void refill(){
		System.out.println("Refilling pen...");
	}
	public void changeNib(){
		System.out.println("Changing nib...");
	}
}

interface BasicAnimal{
	void eat(String food);
	void sleep();
}
class Monkey{
	public void jump(){
		System.out.println("Jumping...");
	}
	public void bite( String target){
		System.out.println("biting "+target);
	}
}

class Human extends Monkey implements BasicAnimal{
	public void eat(String food){
		System.out.println("Eating "+food);
	}
	public void sleep(){
		System.out.println("Sleeping...");
	}
	
	
}
public class Main {
	public static void main(String[] args) {
	/*	FountainPen FP= new FountainPen();
		FP.refill();
		FP.changeNib();
		FP.write();
	*/
	
	/*	Human h1=new Human();
		h1.eat("chocolate");
		h1.sleep();
		h1.jump();
	*/
	/*	Monkey m1= new Human();//polymorphism
	//	m1.eat("banana");//throw error!
		m1.jump();
		m1.bite("monkey2");
	*/
	}
}