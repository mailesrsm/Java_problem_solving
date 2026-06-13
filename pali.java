import java.util.Scanner;
class pali {
	public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int temp=x;
    int rev=0;
    for (int i=x;i>0;i/=10) {
    	int rem=i%10;
    	rev=rev*10+rem;
    }
    if(temp==rev) {
    	System.out.println("Palindrome");
    }
    else {
    	System.out.println("Not a Palindrome");
    }
    
        
    }
}