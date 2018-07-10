import java.util.Scanner;
 
 class Operators {
 
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int test=scn.nextInt();
		for(int i=0;i<test;i++) {
			int num1=scn.nextInt();
			int num2=scn.nextInt();
			if(num1>num2) {
				System.out.println(">");
			}
			else if(num1<num2) {
				System.out.println("<");
			}
			else if(num1==num2) {
				System.out.println("=");
			}
		}
	}
 
} 