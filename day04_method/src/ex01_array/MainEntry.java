//*/

package ex01_array;

public class MainEntry {
	public static void main(String[] args) {
		int [] arr = new int[30];
		int [][] arr2 = new int[2][3]; // �ʱ�ȭ �Ǿ� ���� ���� ���� ��, �� ũ�� ������ �� ����.
		//int [][] a2 = {1,2,3,4,5,6} // error
		int[][]a3 = {{1,2,3},{4,5,6}};
		int[][]a4 = new int [][]{{1,2,3},{4,5,6}}; // ��, �� ũ�� ���� ����
		int [][] a5 = {{0},{0}}; // ��ü 0���� �ʱ�ȭ?
		int count=100;
	//	a5[4][3] = 3;
	//	System.out.println(a5[4][3]);
		
		int [][][] a6 = new int[2][2][3];//��,��,�� ũ��
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