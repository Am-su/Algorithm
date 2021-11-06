import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		int[] list = new int[n*3];
		for(int i=0;i<3*n;i++) {
			list[i++] = sc.nextInt();
			list[i++] = sc.nextInt();
			list[i] = 1;
		}
		
		for(int i=0;i<3*n;i+=3) {
			for(int j = 0;j<3*n;j+=3) {
				if(list[i] >list[j] && list[i+1] > list[j+1])
					list[j+2]++;
			}
		}
		for(int i=2;i<n*3;i+=3) {
			System.out.print(list[i]+" ");
		}
	}
}