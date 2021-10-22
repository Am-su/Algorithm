import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		char[] list = br.readLine().toCharArray();
		for(int i=0;i<5;i++) {
			sum += Math.pow(list[i]-48, 5);
		}
		System.out.println(sum);
	}
}