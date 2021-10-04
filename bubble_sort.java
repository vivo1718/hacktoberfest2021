
import java.util.*;
class Bubble{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		bubble_ascend(arr);//  IN Ascending Order
		System.out.print("Ascending Order: ");

		for(int i = 0;i<n;i++){
			System.out.print(arr[i]);
		}
		System.out.print("\n");
		bubble_descend(arr);// 
	    System.out.print("Descending  Order: ");// IN Descending Order
		for(int i = 0;i<n;i++){
			System.out.print(arr[i]);
		}

	}
	static void bubble_ascend(int arr[]){
		int i,j,temp,n = arr.length;

		for(i=0;i<n;i++){
			for(j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
	}
	static void bubble_descend(int arr[]){
		int i,j,temp,n = arr.length;

		for(i=0;i<n;i++){
			for(j=0;j<n-i-1;j++){
				if(arr[j]<arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
	}
}
