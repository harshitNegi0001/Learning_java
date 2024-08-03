import java.io.*;
import java.util.*;
public class File_handling {
	public static void main(String[] args) {
		File f= new File("myFile.txt");//it is just an object(f)
		try{
			f.createNewFile();//for create a new file
		}
		catch(IOException e){
			System.out.println("Failed in creating file");
		}
		
		try{
			
			FileWriter fw = new FileWriter(f);
			fw.write("hey this is my first file");//to write in a file
			fw.close();
		}
		catch(IOException e){
			System.out.println("unable to write in file");
		}
		
		try{
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine()){//scan one by one line of file
				System.out.println(sc.nextLine());//print one by one line of file
			}
		}
		catch(IOException e){
			System.out.println(e);
			
		}
		
		f.delete();//for delete the file
			
			
		
	}
}