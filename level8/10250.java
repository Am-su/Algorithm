import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i,j,k=0;
		
		for(i=0;i<n;i++) {
			int a = sc.nextInt();	//층
			int b = sc.nextInt();	//호	
			int c = sc.nextInt();	//n번쨰 손님
			int[][] arr = new int[a][b];
			int room = 0;	
			for(j=0;j<b;j++) {
				for(k=0;k<a;k++) {
					if(room == c)
						break;
					room++;
				}
				if(room == c) 
					break;
			}
			System.out.println((k)*100 + (j+1));
		}
	}
}