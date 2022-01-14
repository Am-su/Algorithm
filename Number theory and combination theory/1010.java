import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	static int[][] dp;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int N,R;
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine()," ");
			R=Integer.parseInt(st.nextToken());
			N=Integer.parseInt(st.nextToken());
			dp = new int[N+1][R+1];
			System.out.println(func(N,R));
		}
		
	}
	static int func(int n, int r) {
		if(dp[n][r] > 0) {
			return dp[n][r];
		}
		if(n==r || r==0) {
			return dp[n][r] = 1;
		}
		return dp[n][r] = func(n-1,r-1) + func(n-1,r);
	}
}