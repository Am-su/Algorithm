import java.util.Scanner;

public class Main{
	public static int[] number;
	public static int[] operator = new int[4];
	public static int N;
	public static int MAX = Integer.MIN_VALUE;
	public static int MIN = Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		number = new int[N];
		for(int i=0;i<N;i++) {
			number[i] = sc.nextInt();
		}
		for(int i=0;i<4;i++) {
			operator[i] = sc.nextInt();
		}
		dfs(number[0],1);
		System.out.println(MAX);
		System.out.println(MIN);
		
	}
	public static void dfs(int n, int idx) {
		
		if(idx==N) {
			MAX = Math.max(MAX, n);
			MIN = Math.min(MIN, n);
			return;
		}
		
		for(int i=0;i<4;i++) {
			if(operator[i]>0) {
				operator[i]--;
				
				switch(i) {
				case 0: dfs(n+number[idx],idx+1); break;
				case 1: dfs(n-number[idx],idx+1); break;
				case 2: dfs(n*number[idx],idx+1); break;
				case 3: dfs(n/number[idx],idx+1); break;				
				}
				operator[i]++;
			}
		}
	}
}