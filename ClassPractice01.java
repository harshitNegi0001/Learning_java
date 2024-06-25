
class Employee{
	private String name;
	private int salary;
	
	public void setName(String n){
		this.name=n;
	}
	public void setSalary(int s){
		this.salary=s;
	}
	public String getName(){
		return name;
	}
	public int getSalary(){
		return salary;
	}
}
class Square{
	int side;
	public Square(int a){ this.side=a;}//constructor
	public int area(){
		return this.side*this.side;
	}
	public int perimeter(){
		return this.side*4;
	}
}
class Ractangle{
	int length , width;
	public Ractangle(int l,int w){ 
	this.length=l;
	this.width=w;
	}//constructor
	public int area(){
		return this.length*this.width;
	}
	public int perimeter(){
		return 2*(this.length + this.width);
	}
}

class Circle{
	double redius;
	public Circle(int r){ this.redius=r;}//constructor
	public double area(){
		return 3.14*this.redius*this.redius;
	}
	public double perimeter(){
		return 2*3.14*this.redius;
	}
}

public class Main {
	public static void main(String[] args) {
	/*	//problem_1
		Employee e1=new Employee();
		e1.setName("Rohan");
		e1.setSalary(10000);
		Employee e2=new Employee();
		e2.setName("Harsh");
		e2.setSalary(20000);
		System.out.println("name = "+e1.getName());
		System.out.println("salary = "+e2.getSalary());
	*/
	/*	//problem_2
		Square s1= new Square(10);
		System.out.println("area = "+s1.area());
		System.out.println("perimeter = "+s1.perimeter());
	*/
	
	/*	//problem_3
		Ractangle r1= new Ractangle(10,5);
		System.out.println("area = "+r1.area());
		System.out.println("perimeter = "+r1.perimeter());
	*/
	/*	//problem_4
		Circle c1= new Circle(10);
		System.out.println("area = "+c1.area());
		System.out.println("perimeter = "+c1.perimeter());
	*/
	}
}