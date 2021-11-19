import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static int[] list;
	public static Integer[] dp;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(br.readLine());
		
		list = new int[n+1];
		dp = new Integer[n+1];
		
		for(int i=1;i<=n;i++) {
			list[i] = Integer.parseInt(br.readLine());
		}
		
		dp[0] = list[0];
		dp[1] = list[1];
		
		if(n==1) {
			System.out.println(dp[1]);
		}
		else {
			dp[2] = list[1]+list[2];
			System.out.println(stairs(n));	
		}
		
	}
	public static int stairs(int n) {
		
		if(dp[n] == null) {
			dp[n] = Math.max(stairs(n - 2), stairs(n - 3) + list[n - 1]) + list[n];
		}
		return dp[n];
	}
}