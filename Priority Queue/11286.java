import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> queue = new PriorityQueue<>((o1,o2)->{
			int O1 = Math.abs(o1);
			int O2 = Math.abs(o2);
			
			if(O1 == O2)
				return o1-o2;
		
			return O1 - O2;
		});
		StringBuilder sb = new StringBuilder();
		
		while(N-->0) {
			int x = Integer.parseInt(br.readLine());
			
			if(x == 0) {
				if(queue.isEmpty()) {
					sb.append(0).append("\n");
				}
				else {
					sb.append(queue.poll()).append("\n");
				}
			}
			else {
				queue.add(x);
			}
		}
		System.out.println(sb);
	}
}