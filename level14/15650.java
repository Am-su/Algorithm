import java.util.Scanner;

public class Main{
	
	static int[] list;
	static StringBuilder sb = new StringBuilder();
	static int n,m;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		sc.close();
		
		list = new int[m];
		dfs(1,0);
		System.out.println(sb);
		
	}
	public static void dfs(int cri, int depth) {
		if(depth == m) {
			for(int li : list) {
				sb.append(li).append(' ');
			}
			sb.append('\n');
			return;
		}
		for(int i=cri;i<=n;i++) {
			list[depth] = i;
			dfs(i+1,depth+1);
		}
	}
}