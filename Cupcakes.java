import java.util.Scanner;
 
 class Cupcakes {
 
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int test=scn.nextInt();
		for(int i=0;i<test;i++) {
			int n=scn.nextInt();
			int left=(n/2)+1;
			System.out.println(left);
		}
	}
 
}