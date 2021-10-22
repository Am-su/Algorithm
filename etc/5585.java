import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		n = 1000-n;
		int count = 0;
		if(n/500 !=0) {
			count += n/500;
			n %=500;
		}
		if(n/100 !=0) {
			count += n/100;
			n %=100;
		}
		if(n/50 !=0) {
			count += n/50;
			n %=50;
		}
		if(n/10 !=0) {
			count += n/10;
			n %=10;
		}
		if(n/5 !=0) {
			count += n/5;
			n %=5;
		}
		if(n/1 !=0) {
			count += n/1;
			n %=1;
		}
		System.out.println(count);
	}
}