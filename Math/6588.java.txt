import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = -1;
		int a,b;
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			n = Integer.parseInt(br.readLine());
			if(n==0) {
				break;
			}
			int i;
			for(i=3;i<=n/2;i+=2) {
				a = i;
				b = n-i;
				if(isPrime(a) && isPrime(b)) {
					sb.append(n).append(" = ").append(a).append(" + ").append(b).append("\n");
					break;
				}
			}
			if(i>n) {
				sb.append("Goldbach's conjecture is wrong.");
			}
			
		}
		System.out.println(sb);
	}
	static boolean isPrime(int n) {
		for(int i=2;i*i<=n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
}