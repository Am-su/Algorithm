import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int max = Math.max(a, b);
			int min = Math.min(a, b);
			sb.append(lcm(max,min)+"\n");
		}
		System.out.println(sb);
		
	}
	//최대공약수
	static int gcm(int a, int b) {
		int c;
		while(b!=0) {
			c = a%b;
			a=b;
			b=c;
		}
		return a;
	}
	
	//최소공배수
	static int lcm(int a, int b) {
		return (a*b)/gcm(a,b);
	}
}