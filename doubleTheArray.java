public class Main {
	public static int[] map(int[] arr){
		int[] newArr=new int[arr.length];
		for (int i=0; i<arr.length;i++){
			newArr[i]=arr[i]*2;
			
		}
		return newArr;
	}
	public static void main(String[] args) {
		int [] arr ={1,2,3,4,5,6};
		int[] newArr=map(arr);
		for(int item:newArr){
			System.out.println(item);
		}
	}
}