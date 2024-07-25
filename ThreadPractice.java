class GMThread extends Thread{
	
	public void run(){
		
		for(int i=0;i<40;i++){
			
			System.out.println("Good Morning ");
			try{
				Thread.sleep(300);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}
	
}

class WelcomeThread extends Thread{
	public void run(){
		
		for(int i=0;i<40;i++){
			System.out.println("Welcome");
			try{
				Thread.sleep(300);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}
	
}

public class ThreadPractice {
	public static void main(String[] args) {
		
		
		GMThread t1= new GMThread();
		WelcomeThread t2= new WelcomeThread();
		t2.setPriority(Thread.NORM_PRIORITY);
		t1.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(Thread.currentThread().getId());
		
		
		System.out.println("t1 priority = "+t1.getPriority()+" \nt2 priority = "+t2.getPriority());
		
		t1.start();
		t2.start();
		
		System.out.println(t1.getState());
		System.out.println(t2.getState());
	}
}