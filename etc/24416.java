import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	static int dp[];
	static int cnt1=0;
	static int cnt2=1;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		dp = new int[N];
		fibRec(N-1);
		fibDp(N-1);
		System.out.println(cnt1+" "+cnt2);
	}
	static int fibRec(int n) {
		
		if(n==0 || n==1) {
			cnt1++;
			return 1;
		}
			
		else
			return (fibRec(n-1)+fibRec(n-2));
	}
	static int fibDp(int n) {
		
		dp[0] = dp[1] = 1;
		for(int i=2;i<n;i++) {
			dp[i] = dp[i-1]+dp[i-2];
			cnt2++;
		}
		return dp[n];
	}
}