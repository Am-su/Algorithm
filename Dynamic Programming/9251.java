import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	static char[] str1;
	static char[] str2;
	static Integer[][] dp;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str1 = br.readLine().toCharArray();
		str2 = br.readLine().toCharArray();
		dp = new Integer[str1.length][str2.length];
		
		System.out.println(LCS(str1.length-1,str2.length-1));
	}
	static int LCS(int n1, int n2) {
		if(n1==-1 || n2==-1) {
			return 0;
		}
		
		if(dp[n1][n2] == null) {

			if(str1[n1] == str2[n2]) {
				dp[n1][n2] = LCS(n1-1,n2-1)+1;
			}
			else
				dp[n1][n2] = Math.max(LCS(n1-1,n2), LCS(n1,n2-1));
		}
		return dp[n1][n2];
	}
}