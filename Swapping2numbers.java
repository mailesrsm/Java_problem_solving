import java.util.Scanner;
public class Swapping2numbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Before Swapping");
		System.out.println("Enter the number for a");
		int a=sc.nextInt();
		System.out.println("Enter the number for b");
		int b=sc.nextInt();
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("After swapping");
		System.out.println("The number of a is "+a);
		System.out.println("The number of b is "+b);
		
		
	}
}
