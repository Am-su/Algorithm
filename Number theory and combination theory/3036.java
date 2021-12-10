import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] list = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		StringBuilder sb = new StringBuilder();
		int i = 0;
		
		while(st.hasMoreTokens()) {
			list[i] = Integer.parseInt(st.nextToken());
			i++;
		}
		for(i=1;i<n;i++) {
			int c = gcm(Math.max(list[0], list[i]),Math.min(list[0], list[i]));
			sb.append(list[0]/c).append("/").append(list[i]/c).append("\n");
		}
		System.out.print(sb);
	}
	static int gcm(int a, int b) {
		int c;
		while(b!=0) {
			c = a%b;
			a=b;
			b=c;
		}
		return a;
	}
}