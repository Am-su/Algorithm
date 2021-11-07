import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static Integer[][] list = new Integer[41][2];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		list[0][0] = 1;
		list[0][1] = 0;
		list[1][0] = 0;
		list[1][1] = 1;
		
		for(int i=0;i<n;i++) {
			int temp = Integer.parseInt(br.readLine());
			fibonacci(temp);
			sb.append(list[temp][0]+" "+list[temp][1]+"\n");
			
		}
		System.out.println(sb);
	}
	
	public static Integer[] fibonacci(int n) {

		if(list[n][0] == null || list[n][1] == null) {
			list[n][0] = fibonacci(n-1)[0] + fibonacci(n-2)[0];
			list[n][1] = fibonacci(n-1)[1] + fibonacci(n-2)[1];
		}
		return list[n];
	}
}

