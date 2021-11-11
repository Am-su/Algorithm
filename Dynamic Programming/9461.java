import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static long[] list = new long[100];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		list[0] = 1; list[1] = 1; list[2] = 1; list[3] = 2; list[4] = 2; list[5] = 3;
		list[6] = 4; list[7] = 5; list[8] = 7; list[9] = 9;
		
		for(int i=0;i<n;i++) {
			int N = Integer.parseInt(br.readLine());
			sb.append(triangle(N)).append('\n');
		}
		System.out.print(sb);
	}
	public static long triangle(int n) {
		if(list[n-1] == 0) {
			if(list[n-2] == 0 || list[n-6] == 0) {
				triangle(n-1); triangle(n-5);
			}
			list[n-1] = list[n-2]+list[n-6];
		}
		return list[n-1];
	}
}