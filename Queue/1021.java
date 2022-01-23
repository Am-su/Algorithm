import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		LinkedList<Integer> queue = new LinkedList<>();
		
		int count=0;
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		for(int i=1;i<=n;i++) {
			queue.offer(i);
		}
		
		int[] sel = new int[m];
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<m;i++) {
			sel[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0;i<m;i++) {
			int want = queue.indexOf(sel[i]);
			int half;
			
			if(queue.size() % 2==0) 
				half = queue.size()/2-1;
			else
				half = queue.size()/2;
			
			if(half>=want) {
				for(int j=0;j<want;j++) {
					queue.offer(queue.pollFirst());
					count++;
				}
			}
			else {
				for(int j=0;j<queue.size()-want;j++) {
					queue.offerFirst(queue.pollLast());
					count++;
				}
			}
			queue.pollFirst();
		}
		System.out.println(count);
	}
}