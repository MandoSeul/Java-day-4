package ex02.method;

class Sample{
	int x,y;
	public void setData(int xx, int yy)
	{
		System.out.println(xx+yy);
	}
} // static�� �ƴϸ� ��ü�� �����Ǿ�� ��
public class InstanceMethod {
	
	public void disp(){ // object(��ü)�� �����Ǹ� ��ü�� �Լ� ȣ�� ����
		System.out.println("name = seul");
	}
	
	public static void main(String[] args) {
		InstanceMethod ex = new InstanceMethod(); 
		// ��ü ����, �޸𸮿� �Ҵ�, ������ �Լ� �ڵ� ȣ�� //ex�� object(��ü)��� �θ�
		ex.disp();
		Sample obj = new Sample(); // class��ü
		obj.setData(40, 70);
	}
}

