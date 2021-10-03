import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a,b;
		int n1,n2,n3;
		a = sc.nextInt();
		b = sc.nextInt();
		n3 = b%10;
		n2 = (b%100)/10;
		n1 = b/100;
		System.out.println(a*n3);
		System.out.println(a*n2);
		System.out.println(a*n1);
		System.out.println(a*n3+10*a*n2+100*a*n1);
	}
}