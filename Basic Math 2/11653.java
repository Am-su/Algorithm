import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=2;
		while(n>1) {
			if(n%a==0) {
				n/=a;
				System.out.println(a);
			}
			else 
				a++;
		}
	}
}