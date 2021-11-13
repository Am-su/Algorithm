import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static int[] fibo = new int[1000001];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		fibo[0] = 0;
		fibo[1] = 1;
		fibo[2] = 2;
		System.out.println(fibonacci(n));
	}
	
	public static int fibonacci(int n) {

		if(fibo[n] == 0 && n != 0) {
			fibo[n] = (fibonacci(n-1)+fibonacci(n-2)) % 15746;
		}
		return fibo[n];
	}
}