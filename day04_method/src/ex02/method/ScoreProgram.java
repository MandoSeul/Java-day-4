package ex02.method;

import java.util.Scanner;


public class ScoreProgram {
	
	
	public void input(int subjectnumi, int studentnum, int [][] Score){
	

		Scanner sc = new Scanner(System.in);
		//2-1. �Է¹��� ������ do~while�� �̿��ؼ� 0~100�� ���� ������ �Է��ϼ���.
		for(int i =0; i<Score.length; i++){
			for(int j =0; j<Score[i].length; j++)
			{
				System.out.println((i+1)+"��° �л���" +(j+1)+"��° ������ ������ �Է��Ͻÿ� : ");
				Score[i][j] = sc.nextInt();
			}
		}//end big for
	}
	
	public void process(int [][] Score, int [] total, double[] avg){
		//����, ��� ���ϴ� �Լ�
		
		for(int i =0; i<Score.length; i++){
			for(int j =0; j<Score[i].length; j++)
			{

				total[i] +=Score[i][j];
				avg[i] = ((double)total[i]/3);
				
			}
		}
	}
	
	public char grademethod(int [][]Score, char grade, double[] avg){
		for(int i =0; i<Score.length; i++){
		
			if((avg[i]<=100)&&(avg[i]>=90))
				grade = 'A';
			else if((avg[i]<=89)&&(avg[i]>=80))
				grade = 'B';
			else if((avg[i]<=79)&&(avg[i]>=70))
				grade = 'C';
			else if((avg[i]<=69)&&(avg[i]>=60))
				grade = 'D';
			else
				grade = 'F';
		}
		return grade;
	}
	
	public void disp(int[][] Score, int[] total, double[] avg, char grade){
		ScoreProgram obj = new ScoreProgram();
		for(int i =0; i<Score.length; i++){
			System.out.println((i+1)  +"���� ����ǥ �Դϴ�");
			for(int j =0; j<Score[i].length; j++)
			{
				System.out.println((i+1)+"���� "+(j+1)+"��° ������ ������ : " +Score[i][j]+"�Դϴ�" );
			}
			System.out.printf((i+1)+ "��°���� total ������ : " + total[i] +"\taverage�� : %.2f " ,avg[i],"�Դϴ�" );
			System.out.println();
			System.out.println((i+1)+"���� Grade is  " + obj.grademethod(Score,grade,avg));
		
		}
	}
	public static void main(String[] args) {
	
		int subjectnum=3, studentnum=4;
		int [][]Score = new int[studentnum][subjectnum];
		int []total = new int[studentnum];
		char grade = 0;
		double[] avg  = new double[studentnum]; // ���-�Ҽ��� 2�ڸ����� ǥ��
		ScoreProgram obj = new ScoreProgram();
		obj.input(subjectnum,studentnum,Score);
		obj.process(Score,total,avg);
		obj.disp(Score, total, avg, grade);
	
	}
}
