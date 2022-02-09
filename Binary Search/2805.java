import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] list = new int[N];
		
		long max = 0;
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<N;i++) {
			list[i] = Integer.parseInt(st.nextToken());
			if(max<list[i])
				max = list[i];
		}
		long min = 0;
		long mid = 0;
		
		while(min<max) {
			mid = (min+max)/2;
			long length=0;
			for(int i=0;i<N;i++) {
				if(list[i] - mid > 0)
					length += (list[i]-mid);
			}
			if(length<M) {
				max = mid;
			}
			else
				min = mid+1;
		}
		System.out.println(min-1);
	}
}