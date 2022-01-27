import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int a,b,c;
		int[][] A;
		int[][] B;
	
		st = new StringTokenizer(br.readLine()," ");
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		A=new int[a][b];
		for(int j=0;j<a;j++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int k=0;k<b;k++) {
				A[j][k] = Integer.parseInt(st.nextToken());
			}
		}
		
		st = new StringTokenizer(br.readLine()," ");
		b = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		B=new int[b][c];
		for(int j=0;j<b;j++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int k=0;k<c;k++) {
				B[j][k] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0;i<a;i++) {
			for(int j=0;j<c;j++) {
				int sum=0;
				for(int k=0;k<b;k++) {
					sum += A[i][k] * B[k][j];
				}
				sb.append(sum).append(' ');
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
}