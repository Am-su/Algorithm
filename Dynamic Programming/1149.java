import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static int[][] cost;
	public static int[][] store;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		cost = new int[N][3];
		store = new int[N][3];
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine()," ");
			cost[i][0] = Integer.parseInt(st.nextToken());
			cost[i][1] = Integer.parseInt(st.nextToken());
			cost[i][2] = Integer.parseInt(st.nextToken());
		}
		store[0][0] = cost[0][0];
		store[0][1] = cost[0][1];
		store[0][2] = cost[0][2];
		
		System.out.println(Math.min(rgbStreet(N-1,0), Math.min(rgbStreet(N-1,1),rgbStreet(N-1,2))));
	}
	
	public static int rgbStreet(int n, int rgb) {
		if(store[n][rgb] == 0) {
			if(rgb == 0) {
				store[n][0] = Math.min(rgbStreet(n-1,1), rgbStreet(n-1,2))+cost[n][0];
			}
			else if(rgb == 1) {
				store[n][1] = Math.min(rgbStreet(n-1,0), rgbStreet(n-1,2))+cost[n][1];
			}
			else
				store[n][2] = Math.min(rgbStreet(n-1,0), rgbStreet(n-1,1))+cost[n][2];
		}
		
		return store[n][rgb];
	}
}