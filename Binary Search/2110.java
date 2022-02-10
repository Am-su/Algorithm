import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
	static int[] list;
	public static void main(String[] argc)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		list = new int[N];
		for(int i=0;i<N;i++) {
			list[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(list);
		int low=1;
		int high = list[N-1] - list[0] + 1;
		while(low<high) {
			int mid = (low+high)/2;
			
			if(modem(mid) < C) {
				high = mid;
			}
			else
				low = mid+1;
		}
		System.out.println(low-1);
	}
	static int modem(int a) {
		int count = 1;
		int last = list[0];
		
		for(int i=1;i<list.length;i++) {
			if(list[i]-last >= a) {
				count++;
				last = list[i];
			}
		}
		return count;
	}
}