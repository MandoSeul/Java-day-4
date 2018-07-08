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
		display(4,7,"hi루");
		Scanner sc = new Scanner(System.in);
		System.out.println("출발 숫자를 입력하시오 : ");
		x = sc.nextInt();
		System.out.println("도착 숫자를 입력하시오 : ");
		y = sc.nextInt();
		System.out.println("출력할 문자열을 입력하시오 : ");
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
		// 삼항 연산자 넣어도 될듯 return (x<y)? y : x ; 이렇게
	}
	public static void main(String[] args) {
		
		int x,y;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("비교할 첫번째 숫자를 입력하시오 : ");
		x = sc.nextInt();
		System.out.print("비교할 두번째 숫자를 입력하시오 : ");
		y = sc.nextInt();
		System.out.println();
		System.out.println("두개의 숫자 중 더 큰 숫자는 : " +max(x, y)+" 입니다.");
	}
}
*/
/*
package ex02.method;

import java.util.Scanner;

//사친연산 함수 - add(x,y), mul(x*y), sub (-), div(/) : 리턴 타입 int
//나눗셈 함수는 예외 처리 적용
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
		System.out.println( "0으로 어떻게 나누니!!!!!");
		return -1;
		}
	}
	
	public static void main(String[] args) {
		
		int x,y,result = 0;
		char math;
		String str;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("계산할 첫번째 숫자를 입력하시오 : ");
		x = sc.nextInt();
		System.out.print("계산할 두번째 숫자를 입력하시오 : ");
		y = sc.nextInt();
		System.out.print("연산자를 입력하시오 : ");
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
		
		System.out.println("결과 값은" + result +" 입니다.");
	}
}*/


package ex02.method;

import java.util.Scanner;

//사친연산 함수 - add(x,y), mul(x*y), sub (-), div(/) : 리턴 타입 int
//나눗셈 함수는 예외 처리 적용
public class MethodType {

 static void arraydisp(int[] x){

	 for(int i=0; i<x.length;i++)
	 System.out.print(x[i]+"\t");
	
	}
 	static void disp(int x,double y,String z){
 		System.out.println("숫자 : " + x+"실수 : "+y+"문자열 : "+z);
	} // 문제 4
 	
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
//		System.out.println("정수, 실수, 문자열을입력하세요 : ");
//		i=sc.nextInt();
//		j=sc.nextDouble();
//		sc.nextLine();
//		str=sc.nextLine();
//		disp(i,j,str);
//		//문제 4
//		
		System.out.println("출발 숫자를 입력하시오 : ");
		x = sc.nextInt();
		System.out.println("도착 숫자를 입력하시오 : ");
		y = sc.nextInt();
		sc.nextLine();
		System.out.println("출력할 문자열을 입력하시오 : ");
		str2 = sc.next();
;
		strdisp(x,y,str2);
		//문제 5
		System.out.println();
		arraydisp(arr);
		
	}
}