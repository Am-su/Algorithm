import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static int[][] list;
	public static int[][] store;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		list = new int[n][];
		store = new int[n][];
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			list[i] = new int[i+1];
			store[i] = new int[i+1];
			for(int j=0;j<=i;j++) {
				list[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		store[0][0] = list[0][0];
		if(n == 1) {
			max = list[0][0];
		}
		else {
			for(int i=0;i<n;i++) {
				if(max<integerTriangle(n-1,i))
					max = integerTriangle(n-1,i);
			}
		}
		System.out.println(max);
	}
	public static int integerTriangle(int n, int idx) {
		if(store[n][idx] == 0) {
			if(n==1) {
				store[n][idx] = list[n][idx] + store[0][0];
			}
			else if(idx == 0) {
				store[n][idx] = list[n][idx] + integerTriangle(n-1,0);
			}
			else if(idx == n) {
				store[n][idx] = list[n][idx] + integerTriangle(n-1,idx-1);
			}
			else {
				store[n][idx] = list[n][idx] + 
						Math.max(integerTriangle(n-1,idx-1), integerTriangle(n-1,idx));
			}
		}
		return store[n][idx];
	}
}