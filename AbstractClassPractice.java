abstract class Shape{
	
	abstract double area();
	abstract double perimetere();
	
}
class Circle extends Shape {
	double redius;
	
	public Circle(double r){
		this.redius=r;
	}
	public double area (){
		return Math.PI*this.redius*this.redius;
	}
	
	public double perimetere (){
		return 2*Math.PI*this.redius;
	}
	
}
class Ractangle extends Shape {
	double length , weight;
	
	public Ractangle(double l , double w ){
		this.length=l;
		this.weight=w;
	}
	public double area (){
		return this.weight*this.length;
	}
	
	public double perimetere (){
		return 2*(this.weight+this.length);
	}
	
}

class Square extends Shape {
	double side;
	
	public Square(double a){
		this.side=a;
	}
	public double area (){
		return this.side*this.side;
	}
	
	public double perimetere (){
		return this.side * 4;
	}
	
}

public class Main {
	public static void main(String[] args) {
		Circle c1=new Circle(7);
		Square s1= new Square(10);
		Ractangle r1= new Ractangle(2,4);
		System.out.println(r1.perimetere());
		System.out.println(r1.area());
		
	}
}