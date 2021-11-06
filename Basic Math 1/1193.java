import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int b = 0;
		int n = 0;
		
		while (true) {
			n++;
			b+=n;
			if(b>=a) {
				
				if(n%2 == 0) {
					System.out.println(a-b+n+"/"+(b-a+1));
				}else {
					System.out.println((b-a+1)+"/"+(a-b+n));
				}
				break;
			}
		}
	}
}