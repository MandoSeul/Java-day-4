//*/

package ex01_array;

public class MainEntry {
	public static void main(String[] args) {
		int [] arr = new int[30];
		int [][] arr2 = new int[2][3]; // 초기화 되어 있지 않을 때는 행, 열 크기 생략할 수 없다.
		//int [][] a2 = {1,2,3,4,5,6} // error
		int[][]a3 = {{1,2,3},{4,5,6}};
		int[][]a4 = new int [][]{{1,2,3},{4,5,6}}; // 열, 행 크기 생략 가능
		int [][] a5 = {{0},{0}}; // 전체 0으로 초기화?
		int count=100;
	//	a5[4][3] = 3;
	//	System.out.println(a5[4][3]);
		
		int [][][] a6 = new int[2][2][3];//면,행,열 크기
		System.out.println(a5.length);
		System.out.println(a5[0].length);
		System.out.println(a5[1].length);
		
		for(int i =0; i<2; i++){
			for(int j =0; j<3; j++)
			{
				arr2[i][j] = (count);
				count+=100;
				System.out.println(arr2[i][j]);
			}
		}
		
		}
	}

//*/