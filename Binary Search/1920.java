import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
	static int[] A;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		A = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<N;i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(A);
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine()," ");
		
		for(int i=0;i<M;i++) {
			if(find(A,Integer.parseInt(st.nextToken()))>=0) {
				sb.append(1).append("\n");
			}
			else
				sb.append(0).append("\n");
		}
		System.out.println(sb);
	}
	static int find(int[] a, int key) {
		int low = 0;
		int high = a.length-1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			
			if(key<a[mid]) {
				high=mid-1;
			}
			else if(key>a[mid]) {
				low=mid+1;
			}
			else
				return mid;
		}
		return -1;
	}
}