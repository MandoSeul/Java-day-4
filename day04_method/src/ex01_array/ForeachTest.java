package ex01_array;

import java.util.Arrays;

public class ForeachTest {
	public static void main(String[] args) {
		int [] arr = {5,4,3,7,1,0};	
		//sort 전 출력
		for(int i = 0; i<6; i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		System.out.println("Foreach - 확장 for 문");

		for(int item : arr){
			System.out.print(item + "\t");
		}
		
		Arrays.sort(arr);
		
		for(int item : arr){
			System.out.print(item + "\t");
		}
		
	}
}
