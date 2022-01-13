import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		long[] distance = new long[n-1];
		long[] city = new long[n];
		long sum = 0;
		
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<n-1;i++) {
			distance[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<n;i++) {
			city[i] = Integer.parseInt(st.nextToken());
		}
		long min = city[0];
		sum += city[0] * distance[0];
		
		for(int i=1;i<n-1;i++) {
			if(city[i]<min) {
				min = city[i];
			}
			sum += distance[i] * min;
		}
		System.out.println(sum);
	}
}