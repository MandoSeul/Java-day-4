package ex01_array;

import java.util.Random;

public class Array3Test {
	public static void main(String[] args) {
		int[][][]arr = new int[2][2][3];//��,�� ,�� ����
		int x = 0;
		System.out.println("�� : " + arr.length);
		System.out.println("�� : " + arr[0].length);
		System.out.println("�� : " + arr[0][0].length);
	
		//input
		for(int i =0 ; i<arr.length;i++){
			for(int j=0; j<arr[0].length;j++){
				for(int k =0; k<arr[0][0].length;k++){
					arr[i][j][k] = ++x;
				//	arr[i][j][k] = new Random().nextInt(45)+1; //  1~45������ ( 1������ 0~44)
				//	arr[i][j][k] = (int)(Math.random()*100 )+1;
				}//k end
			}//j end
		}//i end
		
		//output
		for(int i =0 ; i<arr.length;i++){
			for(int j=0; j<arr[0].length;j++){
				for(int k =0; k<arr[0][0].length;k++){
					System.out.print(arr[i][j][k]+"\t");
				}//k end
				System.out.println();
			}//j end
			System.out.println();
		}//i end
		
	}
}
