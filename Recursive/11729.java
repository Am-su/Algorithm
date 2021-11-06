import java.util.Scanner;

public class Main{
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		sb.append((int)Math.pow(2, n)-1).append('\n');
		Hanoi(n,1,2,3);
		System.out.println(sb);
	}
	
	public static void Hanoi(int n, int x, int y, int z) {
		if(n==1) {
			sb.append(x+" "+z+"\n");
			return;
		}
		Hanoi(n-1,x,z,y);
		sb.append(x+" "+z+"\n");
		Hanoi(n-1,y,x,z);
	}
}