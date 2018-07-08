package ex02.method;

public class MainEntry {
	
	//1. 매개변수 없고, 리턴타입 없는 경우
	public static void disp(){
		System.out.println("display() call **** ");
	}
	
	
	//2. 매개변수 있고, 리턴타입 없는 경우
	public static void plus(int x, int y, String name)
	{
		System.out.println("hap : " +(x+y));
		int sum = x+y;
		System.out.println("sum : " +sum+", " +name);
		System.out.println(name);
	}
	
	//3. 매개변수없고, 리턴타입이 있는 경우(정수형 데이터 리턴하는 경우 예문)
	public static int three()
	{
		int num = 100;
		int x=5, y=3;
		return x+y;
	}
	
	//4. 매개변수 있고, 리턴타입 있는 경우(정수형 데이터 리턴하는 경우 예문)
	public static int four(int x, int y , int z){
		return x*y*z;
	}
	public static void main(String[] args) { // 시작점(진입점)
		
		disp(); //1.
		show(); //1.
		plus(10, 50, "Seul"); //2.
		System.out.println("three : " +three());
		
	}
	// 1. 어디에 만들어도 상관 없는 모습
	public static void show(){
		System.out.println("**** ");
		plus(10,40,"Seul"); // method를 다른 method에서도 불러와서 사용할 수 있다.
	}
	
	
	
}
