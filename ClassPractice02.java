class Cylinder{
	
	private float radius;
	private float height;
	
	public Cylinder(float r,float h){
		
		this.radius=r;
		this.height=h;
			
	}
	
	public double volume (){
		
		return Math.PI * this.radius * this.radius * height;
		
	}
	public double area () {
		
		return 2 * Math.PI * this.radius * this.height + 2 * Math.PI * this.radius* this.radius;
		
	}
	
	
}

public class Main {
	public static void main(String[] args) {
		Cylinder c1 = new Cylinder(2,5);
		
		System.out.println(c1.volume());
		System.out.println(c1.area());
	}
}