import java.util.Scanner;

public class Main{
	
	static boolean[][] list;
	static int min = 64;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		list = new boolean[a][b];
		sc.nextLine();
		
		for(int i=0;i<a;i++) {
			String str = sc.nextLine().trim();
			
			for(int j=0;j<b;j++) {
				if(str.charAt(j)=='W')
					list[i][j] = true;
				else
					list[i][j] = false;
			}
		}
		int row = a-7;
		int col = b-7;
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				find(i,j);
			}
		}
		System.out.println(min);
	}
	static void find(int x, int y) {
		int endX = x+8;
		int endY = y+8;
		int count = 0;
		
		boolean TF = list[x][y];
		
		for(int i=x;i<endX;i++) {
			for(int j=y;j<endY;j++) {
				if(list[i][j] !=TF)
					count++;
				TF = !TF;
			}
			TF = !TF;
		}
		count = Math.min(count, 64-count);
		min = Math.min(min,count);
	}
}