import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	static int[][] arr;
	static int zero=0;
	static int minus=0;
	static int plus=0;
	
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		arr = new int[n][n];
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int j=0;j<n;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		quadTree(0,0,n);
		System.out.println(minus);
		System.out.println(zero);
		System.out.println(plus);
	}
	
	static void quadTree(int row, int col, int n) {
		if(check(row,col,n)) {
			if(arr[row][col]==0) 
				zero++;
			else if(arr[row][col]==1)
				plus++;
			else
				minus++;
			return;
			}
		
		int half = n/3;

		quadTree(row,col,half);
		quadTree(row,col+half,half);
		quadTree(row,col+2*half,half);
		quadTree(row+half,col,half);
		quadTree(row+half,col+half,half);
		quadTree(row+half,col+2*half,half);
		quadTree(row+2*half,col,half);
		quadTree(row+2*half,col+half,half);
		quadTree(row+2*half,col+2*half,half);
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