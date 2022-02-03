import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	static int[][] list = new int[9][9];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0;i<9;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for(int j=0;j<9;j++) {
				list[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		func(0,0);
	}
	static boolean check(int row, int col, int temp) {
		for(int i=0;i<9;i++) {
			if(list[row][i] == temp) {
				return false;
			}
		}
		
		for(int i=0;i<9;i++) {
			if(list[i][col] == temp) {
				return false;
			}
		}
		int startRow = (row/3)*3;
		int startCol = (col/3)*3;
		
		for(int i=startRow;i<startRow+3;i++) {
			for(int j=startCol;j<startCol+3;j++) {
				if(list[i][j] == temp)
					return false;
			}
		}
		return true;
	}
	static void func(int row, int col) {
		if(col==9) {
			func(row+1,0);
			return;
		}
		if(row==9) {
			for(int i=0;i<9;i++) {
				for(int j=0;j<9;j++) {
					System.out.print(list[i][j]+" ");
				}
				System.out.println();
			}
			System.exit(0);
		}
		if(list[row][col] == 0) {
			for(int i=1;i<=9;i++) {
				if(check(row,col,i)) {
					list[row][col] = i;
					func(row,col+1);
				}
			}
			list[row][col] = 0;
			return;
		}
		func(row,col+1);
	}
}