package ex01_array;

import java.util.Arrays;

public class JavaSort {
	public static void main(String[] args) {
		int [] arr = {5,4,3,7,1,0};	
		//sort �� ���
		for(int i = 0; i<6; i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		//sort
		
		System.out.println("���� ���� �����Դϴ�: ");
		Arrays.sort(arr);
		
		//sort �� ���
		for(int i = 0; i<6; i++){
		System.out.print(arr[i]+"\t");
		}
		System.out.println();
		System.out.println("�������� �����Դϴ�");
		
		for(int i = arr.length-1; i>=0 ; i--){
			//a.length-1�� data������ 6������ �迭������ �ε��� 0 ���� ���� �����ϱ� ����
			System.out.print(arr[i]+"\t");
			}
		
		for(int item:arr){
			System.out.print(item+"\t");
		}
	}
}
