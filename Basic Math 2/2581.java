import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int min = b+1;
		int sum = 0;
		
		for(int i=a;i<=b;i++) {
			
			if(i == 1)
				continue;
			else {
				if(isPrime(i) == 1) {
				sum += i;
				if(min>i)
					min = i;
				}
			}
		}
		
		if(min == b+1) {
			System.out.println(-1);
		}
		else {
			System.out.println(sum);
			System.out.println(min);	
		}
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