import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	static int n;
	static int[][] list;
	static boolean[] visit;
	static int min = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		list = new int[n][n];
		visit = new boolean[n];
		StringTokenizer st;
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int j=0;j<n;j++) {
				list[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		minTalent(0,0);
		System.out.println(min);
		
	}
	public static void minTalent(int idx, int count){
		if(count == n/2) {
			diff();
			return;
		}
		for(int i=idx;i<n;i++) {
			if(!visit[i]) {
				visit[i] = true;
				minTalent(i+1,count+1);
				visit[i] = false;
			}
		}
	}
	public static void diff() {
		int team1 = 0;
		int team2 = 0;
		
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				
				if(visit[i] == true && visit[j] == true) {
					team1 +=list[i][j];
					team1 +=list[j][i];
				}
				else if(visit[i] == false && visit[j] == false) {
					team2 += list[i][j];
					team2 += list[j][i];
				}
			}
		}
		int dif = Math.abs(team1-team2);
		if(dif ==0) {
			System.out.println(dif);
			System.exit(0);
		}
		min = Math.min(dif, min);
	}
}