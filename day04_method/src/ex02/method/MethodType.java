/*
package ex02.method;

import java.util.Scanner;

public class MethodType {
	public static void display(int x, int y, String name)
	{
		for(int i=0;i<y-x+1;i++)
		System.out.println(name);
	}
	public static void main(String[] args) {
		
		int x,y;
		String str;
		display(4,7,"hi��");
		Scanner sc = new Scanner(System.in);
		System.out.println("��� ���ڸ� �Է��Ͻÿ� : ");
		x = sc.nextInt();
		System.out.println("���� ���ڸ� �Է��Ͻÿ� : ");
		y = sc.nextInt();
		System.out.println("����� ���ڿ��� �Է��Ͻÿ� : ");
		str = sc.next();
		
		display(x,y,str);
	}
}
*/

/*
package ex02.method;

import java.util.Scanner;

public class MethodType {
	public static int max(int x, int y)
	{
		if(x<y)
			return y;
		else
			return x;
		// ���� ������ �־ �ɵ� return (x<y)? y : x ; �̷���
	}
	public static void main(String[] args) {
		
		int x,y;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ù��° ���ڸ� �Է��Ͻÿ� : ");
		x = sc.nextInt();
		System.out.print("���� �ι�° ���ڸ� �Է��Ͻÿ� : ");
		y = sc.nextInt();
		System.out.println();
		System.out.println("�ΰ��� ���� �� �� ū ���ڴ� : " +max(x, y)+" �Դϴ�.");
	}
}
*/
/*
package ex02.method;

import java.util.Scanner;

//��ģ���� �Լ� - add(x,y), mul(x*y), sub (-), div(/) : ���� Ÿ�� int
//������ �Լ��� ���� ó�� ����
public class MethodType {

	public static int add(int x, int y){
		return x+y;
	}
	public static int mul(int x, int y){
		return x*y;
	}
	public static int sub(int x, int y){
		return x-y;
	}
	public static int div(int x, int y){
		try{
		return x/y;}catch(Exception e){
		System.out.println( "0���� ��� ������!!!!!");
		return -1;
		}
	}
	
	public static void main(String[] args) {
		
		int x,y,result = 0;
		char math;
		String str;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ù��° ���ڸ� �Է��Ͻÿ� : ");
		x = sc.nextInt();
		System.out.print("����� �ι�° ���ڸ� �Է��Ͻÿ� : ");
		y = sc.nextInt();
		System.out.print("�����ڸ� �Է��Ͻÿ� : ");
		str = sc.next();
		math =str.charAt(0);
		
		if(math == '+')
			result = add(x,y);
		else if(math == '-')
			result =sub(x,y);
		else if(math == '*')
			result = mul(x,y);
		else if(math == '/')
			result = div(x,y);
		
		System.out.println("��� ����" + result +" �Դϴ�.");
	}
}*/


package ex02.method;

import java.util.Scanner;

//��ģ���� �Լ� - add(x,y), mul(x*y), sub (-), div(/) : ���� Ÿ�� int
//������ �Լ��� ���� ó�� ����
public class MethodType {

 static void arraydisp(int[] x){

	 for(int i=0; i<x.length;i++)
	 System.out.print(x[i]+"\t");
	
	}
 	static void disp(int x,double y,String z){
 		System.out.println("���� : " + x+"�Ǽ� : "+y+"���ڿ� : "+z);
	} // ���� 4
 	
 	static void strdisp(int x, int y, String str){
 		for(int i=x; i<y; i++){
 			System.out.print(str.charAt(i)+"\t");
 		}

 	}

 
	public static void main(String[] args) {
		int i = 0,x,y;
		double j;
		String str;
		String str2 ;
		int [] arr = {1,2,3,4,5};
		Scanner sc = new Scanner(System.in);
//		System.out.println("����, �Ǽ�, ���ڿ����Է��ϼ��� : ");
//		i=sc.nextInt();
//		j=sc.nextDouble();
//		sc.nextLine();
//		str=sc.nextLine();
//		disp(i,j,str);
//		//���� 4
//		
		System.out.println("��� ���ڸ� �Է��Ͻÿ� : ");
		x = sc.nextInt();
		System.out.println("���� ���ڸ� �Է��Ͻÿ� : ");
		y = sc.nextInt();
		sc.nextLine();
		System.out.println("����� ���ڿ��� �Է��Ͻÿ� : ");
		str2 = sc.next();
;
		strdisp(x,y,str2);
		//���� 5
		System.out.println();
		arraydisp(arr);
		
	}
}