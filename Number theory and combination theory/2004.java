import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		
		long count1 = two(N)-two(N-R)-two(R);
		long count2 = five(N)-five(N-R)-five(R);
		
		System.out.println(Math.min(count1,count2));
	}
	static long two(long n) {
		long count = 0;
		while(n>=2) {
			count+= (n/2);
			n/=2;
		}
		return count;
	}
	static long five(long n) {
		long count = 0;
		while(n>=5) {
			count+= (n/5);
			n/=5;
		}
		return count;
	}
}