import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	static int maxLength = 0;
	static char[][] candy;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		candy = new char[n][n];
		String str;
		
		for(int i=0;i<n;i++) {
			str = br.readLine();
			for(int j=0;j<n;j++) {
				candy[i][j] = str.charAt(j);
			}
		}
		rowLength(candy);
		colLength(candy);
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(candy[i][j] != candy[i][j+1]) {
					swapRow(i,j);
					rowLength(candy);
					colLength(candy);
					swapRow(i,j);
				}
				if(candy[i][j] != candy[i+1][j]) {
					swapCol(i,j);
					rowLength(candy);
					colLength(candy);
					swapCol(i,j);
				}
			}
		}
		for(int i=0;i<n-1;i++) {
			if(candy[n-1][i] != candy[n-1][i+1]) {
				swapRow(n-1,i);
				rowLength(candy);
				colLength(candy);
				swapRow(n-1,i);
			}
		}
		for(int i=0;i<n-1;i++) {
			if(candy[i][n-1] != candy[i+1][n-1]) {
				swapCol(i,n-1);
				rowLength(candy);
				colLength(candy);
				swapCol(i,n-1);
			}
		}
		System.out.println(maxLength);
	}
	static void swapRow(int a, int b) {
		char temp = candy[a][b];
		candy[a][b] = candy[a][b+1];
		candy[a][b+1] = temp;
	}
	static void swapCol(int a, int b) {
		char temp = candy[a][b];
		candy[a][b] = candy[a+1][b];
		candy[a+1][b] = temp;
	}
	static void rowLength(char[][] candy) {
		int n = candy.length;
		
		for(int i=0;i<n;i++) {
			int length=1;
			for(int j=0;j<n-1;j++) {
				if(candy[i][j] == candy[i][j+1]) {
					length++;
					if(maxLength<length)
						maxLength = length;
				}
				else
					length=1;
			}
		}
	}
	static void colLength(char[][] candy) {
		int n = candy.length;
		
		for(int i=0;i<n;i++) {
			int length=1;
			for(int j=0;j<n-1;j++) {
				if(candy[j][i] == candy[j+1][i]) {
					length++;
					if(maxLength<length)
						maxLength = length;
				}
				else
					length=1;
			}
		}
	}
}