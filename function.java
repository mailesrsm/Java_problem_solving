import java.util.Scanner;

public class function {
	static int add(int num,int num1) {
		int c=num+num1;
		return c;
	}
	public static void main(String[] args) {
		Scanner akash=new Scanner(System.in);
		int a=akash.nextInt();
		int b=akash.nextInt();
		int result=add(a,b);
		System.out.println(result);
		
	}
}
