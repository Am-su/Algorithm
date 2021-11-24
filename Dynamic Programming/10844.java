import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static long[][] list;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		list = new long[n][10];
		
		for(int i=0;i<10;i++) {
			list[0][i] = 1;
		}
		long sum = 0;
		
		for(int i=1;i<10;i++) {
			sum+= stairs(n-1,i)%1000000000;
		}
		System.out.println(sum%1000000000);
	}
	public static long stairs(int n, int num) {
		
		if(n == 0) {
			return list[n][num];
		}
		if(list[n][num] == 0) {
			if(num==0) {
				list[n][num] = stairs(n-1,1);
			}
			else if(num==9) {
				list[n][num] = stairs(n-1,8);
			}
			else
				list[n][num] = stairs(n-1,num-1)+stairs(n-1,num+1);
		}
		
		return list[n][num] % 1000000000;
	}
}