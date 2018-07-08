/*/
package ex01_array;

public class SelectionSort {
	public static void main(String[] args) {
		int [] arr = {5,4,3,7,1,0};

		int min, temp;
		for(int k =0; k<arr.length-1; k++){
			min=k;
		for(int j =k+1; j<arr.length;j++)
			if(arr[min]>arr[j]){
				min=j;	
			} // end for
		temp = arr[k];
		arr[k] = arr[min];
		arr[min]=temp;
		}
		for(int i = 0; i<5; i++){
			System.out.println(arr[i]);
		}
	}
}

//*/

package ex01_array;

public class SelectionSort {
	public static void main(String[] args) {
		int [] arr = {5,4,3,7,1,0};
		int temp;
		
		//sort 전 출력
		for(int i = 0; i<6; i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		//sort
		for(int i=0; i<arr.length-1; i++){
		for(int j =i+1; j<arr.length;j++)
			if(arr[i]>arr[j]){
				temp = arr[i];
				arr[i] = arr[j];
				arr[j]=temp;
			} // end for
		}
		//sort 후 출력
		
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i]+"\t");
		}
	}
}

