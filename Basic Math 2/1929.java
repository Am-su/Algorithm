import java.util.Scanner;


public class Main{
	public static boolean prime[];
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); int b = sc.nextInt();
		prime = new boolean[b+1];
		primeList();
		
		for(int i=a;i<=b;i++) {
			if(!prime[i])
				System.out.println(i);
		}	
	}
	public static void primeList() {
		prime[0] = prime[1] = true;
		for(int i=2;i<=Math.sqrt(prime.length);i++) {
			if(prime[i]) continue;
			for(int j=i*i;j<prime.length;j=j+i)
				prime[j] = true;
		}
	}
}