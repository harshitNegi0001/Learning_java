class Work1 implements Runnable{
	public void run(){
		for(int i=0;i<500;i++)
		System.out.println("Work1 running...");
	}
}
class Work2 implements Runnable{
	public void run(){
		for(int i=0;i<500;i++)
		System.out.println("Work2 running...");
	}
}

public class RunnableThread {
	public static void main(String[] args) {
		Work1 w1= new Work1();
		Thread t1= new Thread(w1);
		t1.start();
		
		
		Work2 w2= new Work2();
		Thread t2= new Thread(w2);
		t2.start();
		
	}
}