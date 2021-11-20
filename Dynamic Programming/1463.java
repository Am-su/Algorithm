import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	static Integer[] list;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		list = new Integer[n+1];
		list[0] = list[1] = 0;
		
		System.out.print(math(n));
	}
	static int math(int n) {

		if(list[n] == null) {
			
			if(n%6 == 0) {
				list[n] = Math.min(math(n-1), Math.min(math(n/3), math(n/2))) +1;
			}
			else if(n % 3 == 0) {
				list[n] = Math.min(math(n/3), math(n-1)) +1;
			}
			else if(n % 2 == 0) {
				list[n] = Math.min(math(n/2), math(n-1)) +1;
			}
			else
				list[n] = math(n-1)+1;
		}
		return list[n];
	}
}