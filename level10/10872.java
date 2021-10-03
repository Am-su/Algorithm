import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int re = 1;
		int n = sc.nextInt();
		if(n==0) {
			System.out.println(1);
		}
		else {
			while(n!=0) {
				re *=n;
				n--;
			}
			System.out.println(re);
		}
	}
}