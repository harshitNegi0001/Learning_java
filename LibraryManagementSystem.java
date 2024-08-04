import java.util.*;

class Book{
	int bID;

	String bName;
	String author;
	String issuedBy;
	String issuedDate;

	public Book(int id , String name, String author){
		this.bID=id;
		this.bName = name;
		this.author = author;
		
	}
	public String bookDetail(){
		return "[Id : "+bID+"\nBook Name : "+bName+"\nAuthor Name : "+author+"]";
	}
	public void issueBook(String issuedTo,String Date){
		this.issuedBy=issuedTo;
		this.issuedDate=Date;
	}
	
	public void returned(){
		this.issuedBy=null;
		this.issuedDate=null;
	}
	public String issuedBookDetail(){
		
		return "[Id : "+bID+"\nBook Name : "+bName+"\nAuthor Name : "+author+"\nIssued By :"+issuedBy+"\nIssued Date : "+issuedDate+"]";
		
	}
	
	
}

class Library{
	LinkedList<Book> availableBooks;
	LinkedList<Book> issuedBooks;
	
	public Library(LinkedList <Book> books){
		this.availableBooks=books;
		this.issuedBooks=new LinkedList<>();
	}
	
	public void printAvailableBook(){
		
		for(int i=0;i<availableBooks.size();i++){
			System.out.println(availableBooks.get(i).bookDetail());
			
		}
		
	}
	public void printIssuedBook(){
		if(issuedBooks.size()==0){
			System.out.println("List is empty.\n\n");
		}
		for(int i=0;i<issuedBooks.size();i++){
			System.out.println(issuedBooks.get(i).issuedBookDetail());
			
		}
		
		
	}
	public void addBook(Book book){
		this.availableBooks.add(book);
	}
	public void issueBook(int b,String issuedTo,String date){
		for(int i=0;i<availableBooks.size();i++){
			
			if(availableBooks.get(i).bID==b){
				
				issuedBooks.addLast(availableBooks.get(i));
				this.issuedBooks.getLast().issueBook(issuedTo,date);
			
			
				System.out.println("Book has been issued ");
				availableBooks.remove(i);
			return;
			}
		
		}
		System.out.println("Sorry! book is not available now");
	
	
	}
	
	public void returnBook(int b){
		for(int i=0;i<issuedBooks.size();i++){
			if(issuedBooks.get(i).bID==b){
				issuedBooks.get(i).returned();
				availableBooks.add(issuedBooks.remove(i));
				System.out.println("Book has been returned");
				return;
			}
			
			
		}
		System.out.println("here is not any detail about this book");
		
	}

}



public class LibraryManagementSystem {
	public static void main(String[] args) {
		
		LinkedList<Book> l1= new LinkedList<>();
		Book b1= new Book(1001,"Computer Networking", "James F. Kurose");
		l1.add(b1);
		Book b2= new Book(1002,"Computer System Architecture", "M. Morris Mano");
		l1.add(b2);
		Book b3= new Book(1003,"Fundamentals of Computers","V. Rajaraman ");
		l1.add(b3);
		Book b4= new Book(1004,"Object oriented programming with C++","E.Balagurusamy");
		l1.add(b4);
		
		l1.add(new Book(1005,"Mastering C++","K.R.Venugopal"));
		
		
		Library library1= new Library(l1);
	
		
		library1.addBook(new Book (1006,"Introduction to Computer Science","Gilbert Brands"));
		
		library1.addBook(new Book (1007,"The C Programming Language","Dennis M. Ritchie"));
	
		
		boolean loop=true;
		Scanner sc=new Scanner(System.in);
		int input;
		while(loop){
			System.out.println("Enter 1 for See Available books list.");
			System.out.println("Enter 2 for See issued books list.");
			System.out.println("Enter 3 for add book in Library.");
			System.out.println("Enter 4 for issue a book.");
			System.out.println("Enter 5 for return issued book.");
			System.out.println("Enter 6 for close.");
			try{
				input=sc.nextInt();
			}
			catch(Exception e){
				System.out.println("Input Missmatch Exception occur" );
				sc.nextLine();
				continue;
				
			}
			switch(input){
				case 1:
					library1.printAvailableBook();
					break;
				case 2:
					library1.printIssuedBook();
				
					break;
				case 3:
					System.out.println("Enter book id");
					int id;
					try{
						id=sc.nextInt();
						sc.nextLine();
					}
					catch(Exception e){
						System.out.println("Input Missmatch Exception occur" );
						sc.nextLine();
						continue;
				
					}
					System.out.println("Enter book name");
					String name=sc.nextLine();
					System.out.println("Enter book author name");
					String author=sc.nextLine();
					
					library1.addBook(new Book(id,name,author));
					break;
				case 4:
					System.out.println("here are available books in library :");
					library1.printAvailableBook();
					System.out.println("Enter the id of book you needed.");
					int bId;
					try{
						bId = sc.nextInt();
					sc.nextLine();
					}
					catch(Exception e){
						System.out.println("Input Missmatch Exception occur" );
						sc.nextLine();
						continue;
				
					}
					System.out.println("Enter your name.");
					String yourName=sc.nextLine();
					System.out.println("Enter Date.");
					String date=sc.next();
					
					library1.issueBook(bId,yourName,date);
					
					break;
				case 5:
					System.out.println("Enter the id of book you are returning.");
					int rId;
					try{
						rId=sc.nextInt();
					}
					catch(Exception e){
						System.out.println("Input Missmatch Exception occur" );
						sc.nextLine();
						continue;
				
					}
					library1.returnBook(rId);
					break;
				case 6:
					
					loop=false;
					System.out.println("program closed.");
					break;
				default:
					System.out.println("\n\n\nNote! please enter only (1,2,3,4,5,6).\n\n\n");
				
			}
			
		}
		
	}
	
	
}