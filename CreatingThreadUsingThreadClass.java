class Task1 extends Thread{
	@Override
	public void run(){
		for(int i=0;i<1000;i++)
			System.out.println("task1 running...");
	}
}
class Task2 extends Thread{
	@Override
	public void run(){
		for(int i=0;i<1000;i++)
			System.out.println("task2 running...");
	}
}

public class CreateThread {
	public static void main(String[] args) {
		Task1 t1= new Task1();
		Task2 t2= new Task2();
		t1.start();
		t2.start();
	}
}