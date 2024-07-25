class MyThread extends Thread{
	public MyThread (String name){
		super(name);
	}
	public void run(){
		for(int i=0;i<40;i++){
			System.out.println(this.getName()+" is running...");
		}
	}
	
}

public class ThreadPriority {
	public static void main(String[] args) {
		MyThread t1 = new MyThread("task 1");
		MyThread t2 = new MyThread("task 2");
		MyThread t3 = new MyThread("task 3");
		MyThread t4 = new MyThread("task 4");
		
		//setting priority..
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		t4.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}