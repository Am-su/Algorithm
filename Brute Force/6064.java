import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		boolean flag;
		
		while(T-->0) {
			flag = false;
			st = new StringTokenizer(br.readLine());
			
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken())-1;
			int y = Integer.parseInt(st.nextToken())-1;
			
			for(int i=x;i<M*N;i+=M) {
				if(i%N==y) {
					sb.append(i+1).append("\n");
					flag = true;
					break;
				}
			}
			if(flag==false)
				sb.append(-1).append("\n");
		}
		System.out.println(sb);
	}
}