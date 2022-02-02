import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	static long mod = 1000000007;
	
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		long top = fact(a);
		long bottom = fact(b) * fact(a-b) % mod;
		System.out.println(top * pow(bottom, mod - 2) % mod);
	}
	static long fact(long n) {
		long temp = 1;
		
		while(n>1) {
			temp = (temp*n)%mod;
			n--;
		}
		return temp;
	}
	static long pow(long a, long b) {
		if(b==1) {
			return a % mod;
		}
		long temp = pow(a,b/2);
		
		if(b%2 == 1) {
			return (temp * temp % mod) * a % mod;
		}
		return temp*temp%mod;
	}
}