package ex02.method;

class Sample{
	int x,y;
	public void setData(int xx, int yy)
	{
		System.out.println(xx+yy);
	}
} // static이 아니면 객체가 생성되어야 함
public class InstanceMethod {
	
	public void disp(){ // object(객체)가 생성되면 객체로 함수 호출 가능
		System.out.println("name = seul");
	}
	
	public static void main(String[] args) {
		InstanceMethod ex = new InstanceMethod(); 
		// 객체 생성, 메모리에 할당, 생성자 함수 자동 호출 //ex를 object(객체)라고 부름
		ex.disp();
		Sample obj = new Sample(); // class객체
		obj.setData(40, 70);
	}
}

