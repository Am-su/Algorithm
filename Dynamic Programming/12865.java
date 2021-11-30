import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	static int[][] list;
	static Integer[][] dp;	
	static int weight;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		weight = Integer.parseInt(st.nextToken());
		list = new int[n][2];
		dp = new Integer[n][weight+1];
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine()," ");
			list[i][0] = Integer.parseInt(st.nextToken());	//무게
			list[i][1] = Integer.parseInt(st.nextToken());	//가치
		}
		
		System.out.println(bag(n-1,weight));

		
	}
	static Integer bag(int n,int weight) {
		
		if(n<0)
			return 0;
		
		if(dp[n][weight] == null) {
			if(weight<list[n][0]) {
				dp[n][weight] = bag(n-1,weight);
			}
			else {
				dp[n][weight] = Math.max(bag(n-1,weight-list[n][0])+list[n][1], bag(n-1,weight));
			}
		}
		return dp[n][weight];
	}
}