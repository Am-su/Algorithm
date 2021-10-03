import java.util.Scanner;

public class Main{
	
	static int[] list;
	static boolean[] visit;
	static StringBuilder sb = new StringBuilder();
	static int n,m;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		sc.close();
		
		list = new int[m];
		visit = new boolean[n];
		dfs(0);
		System.out.println(sb);
		
	}
	public static void dfs(int depth) {
		if(depth == m) {
			for(int li : list) {
				sb.append(li).append(' ');
			}
			sb.append("\n");
			return;
		}
		for(int i=0;i<n;i++) {
			if(!visit[i]) {
				visit[i] = true;
				list[depth] = i+1;
				dfs(depth+1);
				visit[i] = false;
			}
		}
	}
}