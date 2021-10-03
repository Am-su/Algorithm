import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		
		for(int i=0;i<n;i++) {
			int number = sc.nextInt();
			if(number == 1)
				continue;
			else {
				if(isPrime(number) == 1)
					count++;
			}
		}
		System.out.println(count);
	}
	public static int isPrime(int n) {
		int i;
		for(i=2;i<n;i++) {
			if(n % i == 0) {
				break;
			}
		}
		if(n==i)
			return 1;
		else
			return -1;
	}
}