import java.util.Scanner;

public class ArrayLoopPractice {
	public static void main(String[] args) {
		//problem_1
		float [] precentage={56.7f,78.5f,59.0f,92.5f,69.4f};
		float sum=0.0f;
		for(float e: precentage){
			
			sum+=e;
			
		}
		System.out.println("sum = "+sum);
	
		//problem_2
		int[] num={12,58,79,27,14,68,78,64,43,50};
		int key=68;
		boolean isInArray=false;
		for(int e: num){
			if(key==e){
				isInArray=true;
				break;
			}
		}
		if(isInArray){
			System.out.println("The key element is in the Array ");
		}
		else{
			System.out.println("The key element is not in the Array");
		}
	
		//problem_3
		int [] marks={59,54,69,78,81,72,59};
		int sum_=0;
		float average;
		for(int e:marks){
			sum+=e;
		}
		average=(float)(sum)/marks.length;
		System.out.println(average);
	
	
		//problem_4
		Scanner sc=new Scanner(System.in);
		
		int [][] matrix= new int [2][3];
		
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				matrix[i][j]=sc.nextInt();
			}
		
		}
		
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				System.out.print(matrix[i][j]);
			}
			System.out.println("");
		}
	
		//problem_5
		int[][] matrix1={{1,2,5},{5,7,9}};
		int [][] matrix2={{7,8,5},{4,8,9}};
		int [][] sumOfMatrix=new int [2][3];
		for(int i=0;i<matrix1.length;i++){
			for(int j=0;j<matrix1[i].length;j++){
				sumOfMatrix[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		for(int i=0;i<sumOfMatrix.length;i++){
			System.out.print("|");
			for(int j=0;j<sumOfMatrix[i].length;j++){
				System.out.print(sumOfMatrix[i][j]+" ");
			}
			System.out.println("|");
		}
	
		//problem_6
		//find max and min in an array
		int [] numbers={78,97,102,54,76,38,92,156,67,78};
		int max=numbers[0];
		int min=numbers[0];
		for(int i=0;i<numbers.length;i++){
			if(max<numbers[i]){
				max=numbers[i];
			}
			if(min>numbers[i]){
				min=numbers[i];
			}
		}
		System.out.printf("maximum number in array = %d \nminimum number in array = %d",max,min);
	
		//problem_7
		//reverse an array
		int[] arr={1,2,3,4,5,6,7,8,9};
		
		for(int i=0;i<arr.length/2;i++){
			int temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
		for(int e:arr){
			System.out.print(e+" ");
		}
	
		//problem_8
		//check array is sorted or not
	//	int[]arr1={10,23,56,65,78,97,103,140};
		int [] arr1={89,76,34,67,54,97};
		boolean isSorted=true;
		
		for(int i=0;i<arr1.length-1;i++){
			if(arr1[i]>arr1[i+1]){
				isSorted=false;
				break;
			}
		}
		if(isSorted){
			System.out.println("Array is sorted ");
		}
		else{
			System.out.println("Array is not sorted ");
		}
	
		
	}
}