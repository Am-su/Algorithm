import java.util.Scanner;

public class Main{
	static char[][] arr;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		arr = new char[n][n];
		
		printStar(0,0,n,false);
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}
		System.out.println(sb);
		
	}
	
	static void printStar(int x, int y, int n, boolean blank) {
		
		if(blank) {
			for(int i=x;i<x+n;i++) {
				for(int j=y;j<y+n;j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}
		if(n==1) {
			arr[x][y] = '*';
			return;
		}
		
		int size = n/3;
		int count = 0;
		for(int i = x; i<x+n;i+=size) {
			for(int j=y;j<y+n;j+=size) {
				count++;
				if(count == 5)
					printStar(i,j,size,true);
				else
					printStar(i,j,size,false);
			}
		}
	}
}