import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main{
	static int[][] dp;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		HashMap<String,Integer> hm;
		
		for(int i=0;i<n;i++) {
			int m = Integer.parseInt(br.readLine());
			hm = new HashMap<>();
			for(int j=0;j<m;j++) {
				st = new StringTokenizer(br.readLine()," ");
				st.nextToken();
				String cloth = st.nextToken();
				if(hm.containsKey(cloth)) {
				 hm.put(cloth, hm.get(cloth)+1);
				}
				else
				 hm.put(cloth, 1);
			}
			int result = 1;
			for(int temp : hm.values()) {
			 result *= (temp+1);
			}
			sb.append(result-1+"\n");	
		}
		System.out.println(sb);
	}
}