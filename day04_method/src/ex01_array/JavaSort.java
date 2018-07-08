package ex01_array;

import java.util.Arrays;

public class JavaSort {
	public static void main(String[] args) {
		int [] arr = {5,4,3,7,1,0};	
		//sort 전 출력
		for(int i = 0; i<6; i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		//sort
		
		System.out.println("오름 차순 정률입니다: ");
		Arrays.sort(arr);
		
		//sort 후 출력
		for(int i = 0; i<6; i++){
		System.out.print(arr[i]+"\t");
		}
		System.out.println();
		System.out.println("내림차순 정률입니다");
		
		for(int i = arr.length-1; i>=0 ; i--){
			//a.length-1은 data개수는 6개지만 배열에서는 인덱스 0 에서 부터 시작하기 때문
			System.out.print(arr[i]+"\t");
			}
		
		for(int item:arr){
			System.out.print(item+"\t");
		}
	}
}
