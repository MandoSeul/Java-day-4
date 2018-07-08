package ex03.arguement;

public class MainEntry {
public static void main(String[] args) {
	if(args.length ==0){
		System.out.println("Error sorry ");
		return;
	}
	System.out.println(args[0] + "," +args[1]);
	System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
}
}
