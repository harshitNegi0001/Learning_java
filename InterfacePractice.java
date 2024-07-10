interface Wifi{
	
	void connectWifi(String name);
	void disconnectWifi();
	
}
interface Camera{
	void takeSnap();
	void recordVideo();
	default void record4kVideo(){
		System.out.println("Recording 4k video");
	}
	
}

class CellPhone{
	
	void connectCall(String number){
		System.out.println("Calling "+number);
		
	}
	void receiveCall(){
		System.out.println("connecting...");
	}
	
}

class SmartPhone extends CellPhone implements Wifi , Camera{
	public void connectWifi(String name){
		System.out.println("connecting to " +name+"...");
	}
	public void disconnectWifi(){
		System.out.println("disconnecting...");
	}
	public void takeSnap(){
		System.out.println("taking snap ...");
	}
	public void recordVideo(){
		System.out.println("recording video...");
	}
	
}


public class Main {
	public static void main(String[] args) {
		SmartPhone SM1=new SmartPhone();
		SM1.connectWifi("jio fiber");
		SM1.disconnectWifi();
		
		SM1.takeSnap();
		SM1.recordVideo();
		
		SM1.record4kVideo();
	}
}