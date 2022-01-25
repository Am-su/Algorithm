import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	static int[][] arr;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		
		arr = new int[n][n];
		for(int i=0;i<n;i++) {
			String str = br.readLine();
			for(int j=0;j<n;j++) {
				arr[i][j] = str.charAt(j)-'0';
			}
		}
		quadTree(0,0,n);
		System.out.println(sb);
	}
	
	static void quadTree(int row, int col, int n) {
		if(check(row,col,n)) {
			if(arr[row][col]==0) 
				sb.append(0);
			else
				sb.append(1);
			return;
			}
		int half = n/2;
		sb.append('(');
		quadTree(row,col,half);
		quadTree(row,col+half,half);
		quadTree(row+half,col,half);
		quadTree(row+half,col+half,half);
		sb.append(')');
	}
	static boolean check(int row, int col, int n) {
		int temp = arr[row][col];
		for(int i=row;i<row+n;i++) {
			for(int j=col;j<col+n;j++) {
				if(arr[i][j] != temp)

					return false;
			}
		}
		return true;
	}
}