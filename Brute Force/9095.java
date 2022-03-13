import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	static int[] dp;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		dp = new int[12];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		for(int i=0;i<T;i++) {
			int n = Integer.parseInt(br.readLine());
			sb.append(getCount(n)).append("\n");
		}
		System.out.println(sb);
	}
	static int getCount(int n) {
		if(dp[n]==0) {
			dp[n] = getCount(n-1) + getCount(n-2) + getCount(n-3);
		}
		return dp[n];
	}
}