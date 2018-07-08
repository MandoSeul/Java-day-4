
/*
package ex02.method;

public class StaticMethod {
	public static void main(String[] args) {
		show();
	}
	public static void show(){
		System.out.println("Cheer up Baby~~");
	}
}


*/

package ex02.method;

class Sample2{
	public static void show(){
		System.out.println("Cheer up Baby~~");
	}
	
}
public class StaticMethod {
	
	public static void main(String[] args) {
		Sample2.show();
	}
}
