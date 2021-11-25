import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[][] list;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		list = new int[n][3];
		int flag = 0;
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for(int i=0;i<n;i++) {
			list[i][0] = Integer.parseInt(st.nextToken());
			list[i][1] = list[i][2] = 1;
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(list[j][0]<list[i][0] && list[i][1] < list[j][1]+1) {
					list[i][1]++;
				}
			}
		}
		for(int i=n-1;i>=0;i--) {
			for(int j=n-1;j>i;j--) {
				if(list[j][0]<list[i][0] && list[i][2] < list[j][2]+1) {
					list[i][2]++;
				}
			}
		}
		int max = -1;
		for(int i=0;i<n;i++) {
			max = Math.max(max, list[i][1] + list[i][2]);
		}
		System.out.println(max-1);
	}

}