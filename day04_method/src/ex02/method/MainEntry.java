package ex02.method;

public class MainEntry {
	
	//1. �Ű����� ����, ����Ÿ�� ���� ���
	public static void disp(){
		System.out.println("display() call **** ");
	}
	
	
	//2. �Ű����� �ְ�, ����Ÿ�� ���� ���
	public static void plus(int x, int y, String name)
	{
		System.out.println("hap : " +(x+y));
		int sum = x+y;
		System.out.println("sum : " +sum+", " +name);
		System.out.println(name);
	}
	
	//3. �Ű���������, ����Ÿ���� �ִ� ���(������ ������ �����ϴ� ��� ����)
	public static int three()
	{
		int num = 100;
		int x=5, y=3;
		return x+y;
	}
	
	//4. �Ű����� �ְ�, ����Ÿ�� �ִ� ���(������ ������ �����ϴ� ��� ����)
	public static int four(int x, int y , int z){
		return x*y*z;
	}
	public static void main(String[] args) { // ������(������)
		
		disp(); //1.
		show(); //1.
		plus(10, 50, "Seul"); //2.
		System.out.println("three : " +three());
		
	}
	// 1. ��� ���� ��� ���� ���
	public static void show(){
		System.out.println("**** ");
		plus(10,40,"Seul"); // method�� �ٸ� method������ �ҷ��ͼ� ����� �� �ִ�.
	}
	
	
	
}
