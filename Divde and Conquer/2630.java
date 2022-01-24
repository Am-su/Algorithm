import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	static int[][] arr;
	static int white=0;
	static int blue=0;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		arr = new int[n][n];
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<n;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		merge(0,0,n);
		System.out.print(white+"\n"+blue);
		
	}
	static void merge(int row, int col, int n) {
		if(check(row,col,n)) {
			if(arr[row][col]==1) {
				blue++;
			}
			else
				white++;
			return;
		}
		int half = n/2;
		
		merge(row,col,half);
		merge(row,col+half,half);
		merge(row+half,col,half);
		merge(row+half,col+half,half);
	}
	static boolean check(int row, int col, int n) {
		int color = arr[row][col];
		
		for(int i=row;i<row+n;i++) {
			for(int j=col;j<col+n;j++) {
				if(color != arr[i][j])
					return false;
			}
		}
		return true;
	}
}
