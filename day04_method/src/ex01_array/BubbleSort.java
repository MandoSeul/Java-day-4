package ex01_array;

public class BubbleSort {
public static void main(String[] args) {
	int []arr = {6,9,8,67,4};
	int temp;
	for(int i=0; i<arr.length;i++){
		for(int j=0; j<(arr.length-(i+1));j++)
		{
			if(arr[j]>arr[j+1]){
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1]=temp;
			}//end if
				
		}
	}// big for end
	

	for(int i = 0; i<arr.length; i++){
		System.out.print(arr[i]+"\t");
	}
}
}
