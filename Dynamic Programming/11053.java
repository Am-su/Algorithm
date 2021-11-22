import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static int[][] list;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		list = new int[n][2];
		
		for(int i=0;i<n;i++) {
			list[i][0] = Integer.parseInt(st.nextToken());
			list[i][1] = 1;
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(list[j][0] < list[i][0] && list[i][1] < list[j][1]+1) {
					list[i][1]++;
				}
			}
		}
		int max = -1;
		for(int i=0;i<n;i++) {
			max = list[i][1] > max ? list[i][1] : max;
		}
		System.out.println(max);
	}
}