import java.util.Scanner;
public class Main {
	public static int getMax(int month,int year){
		int max=0;
		switch (month){
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					max= 31;
					break;
				case 2 :
					if ((year%4==0 && year%100!=0)||year%400==0){
						max=29;
					}
					else {
						max=28;
					}
					break;
				default :
					max=30;
		}
		return max;	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int date,month,year;
		int ndate,nmonth,nyear;
		int pdate,pmonth,pyear;
		System.out.print("Enter Date : ");
		date=sc.nextInt();
		
		System.out.print("Enter Month : ");
		month=sc.nextInt();
		
		System.out.print("Enter Year : ");
		year=sc.nextInt();
		
		//varifying date -》
		if(year<1 || month <1 || month > 12 || date <1 || date > 31){
			System.out.println("Your entered date is invalid ");
		}
		else{
			int max=getMax(month,year);
			
			
			if (date>max){
				System.out.println("Your entered date is invalid");
			}
			
			else{
				//nextDateCalculator
				if(date!=max){
					ndate=date+1;
					nmonth=month;
					nyear=year;
				}
				else{
					ndate=1;
					if(month!=12){
						nmonth=month+1;
						nyear=year;
					}
					else{
						nmonth=1;
						nyear=year+1;
					}
				}
			
				System.out.println("Next date is : "+ndate+"/"+nmonth+"/"+nyear);
				//priviousDateCalculator
				
				if(date!=1){
					pdate=date-1;
					pmonth=month;
					pyear=year;
					
				}
				else{
					
					if(month!=1){
						
						pdate=getMax(month-1,year);
						pmonth=month-1;
						pyear=year;
					}
					else{
						pdate=31;
						pmonth=12;
						pyear=year-1;
						
					}
				}
				System.out.println("Privious date was : "+pdate+"/"+pmonth+"/"+pyear);
				
			}
					
		}
		
	}
}