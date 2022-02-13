import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Integer> queue = new PriorityQueue<>();
	
		while(N-->0) {
			int temp = Integer.parseInt(br.readLine());
			if(temp==0) {
				if(queue.size()==0) {
					sb.append(0).append("\n");
				}
				else {
					sb.append(queue.poll()).append("\n");
				}
			}
			else {
				queue.offer(temp);
			}
		}
		System.out.println(sb);
	} 
}