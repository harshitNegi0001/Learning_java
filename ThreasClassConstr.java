class MyThread extends Thread{
	int n;
	public MyThread(String name,int n){
		super(name);
		this.n=n;
	}
	
	public void run(){
		for(int i=0;i<20;i++)
			System.out.println("Task "+n+" is running...");
	}
}

public class ThreadConstructors {
	public static void main(String[] args) {
		MyThread a=new MyThread("Rohit",1);
		MyThread b=new MyThread("Shubham",2);
		a.start();
		b.start();
		
		
		System.out.println("thread a id = "+a.getId());
		System.out.println("thread a name = "+a.getName());
		System.out.println("thread b id = "+b.getId());
		System.out.println("thread b name = "+b.getName());
		
	}
}