import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b,c;
		int i,j,k,d;
		int[][] arr = new int[15][15];
		int[] arr2 = new int[225];
		
		for(i=0;i<15;i++) {
			arr[0][i] = i;
		}
		
		for(i=0;i<a;i++) {
			b=sc.nextInt();
			c=sc.nextInt();
			
			for(k=1;k<15;k++) {
				for(j=1;j<15;j++) {
					arr[k][j] = 0;
				}
			}
			
			for(k=1;k<15;k++) {
				for(j=1;j<15;j++) {
					for(d=1;d<j+1;d++) {
						arr[k][j] += arr[k-1][d];
					}
				}
			}
			arr2[i] = arr[b][c];
		}	
		for(i=0;i<a;i++) {
			System.out.println(arr2[i]);
		}
	}
}