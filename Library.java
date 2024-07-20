class Library{
	String[] book;
	int numOfBooks;
	Library(){
		this.book=new String[100];
		this.numOfBooks=0;
		
	}
	public void availableBook(){
		System.out.println("Available books : ");
		for(String b : book){
			if(b==null){
				continue;
			}
			System.out.println("*"+b);
		}
	}
	public void addBook(String book){
		this.book[numOfBooks]=book;
		numOfBooks++;
		
	}
	public void issueBook(String book){
		for(int i=0;i<this.book.length;i++){
			if(this.book[i]==book){
				this.book[i]=null;
				System.out.println("book has been issued ");
				return;
			}
		}
		System.out.println("book not found!");
	}
	
	
}

public class Main {
	public static void main(String[] args) {
		Library l1=new Library();
		l1.addBook("Learn C++");
		
		l1.addBook("Learn pyhton");
		l1.addBook("Learn java");
		l1.availableBook();
		l1.issueBook("Learn C++");
		l1.availableBook();
	}
}