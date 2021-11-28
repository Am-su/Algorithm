import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	static int[] list;
	static Integer[] dp;
	static int max;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		list = new int[n];
		dp = new Integer[n];
		
		for(int i=0;i<n;i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		if(n==1) {
			System.out.println(list[0]);
		}
		else {
			dp[0] = list[0];
			max = list[0];
			sum(n-1);
			System.out.println(max);
		}
		
	}
	static int sum(int n) {
		if(dp[n] == null) {
			dp[n] = Math.max(sum(n-1)+list[n], list[n]);
			max = Math.max(dp[n], max);
		}
		return dp[n];		
	}
}