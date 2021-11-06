import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int result;
		
		int[] list = new int[n];
		
		for(int i=0;i<n;i++) 
			list[i] = sc.nextInt();
		System.out.println(blackJack(list,n,m));
	}
	static int blackJack(int[] list,int n,int m) {
		
		int result = 0;
		for(int i=0;i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;k<n;k++) {
					int temp = list[i]+list[j]+list[k];
					
					if(m==temp) 
						return temp;
					if(temp>result && temp<m) 
						result = temp;
				}
			}
		}
		return result;
	}
}