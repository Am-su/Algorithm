import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		Deque<Integer> deque = new ArrayDeque<>(n);
		int temp;
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		for(int i=1;i<=n;i++) {
			deque.add(i);
		}
		while(deque.size() != 0) {
			for(int i=0;i<k-1;i++) {
				deque.add(deque.poll());
			}
			if(deque.size() == 1) {
				sb.append(deque.pop()).append(">");
			}
			else {
				sb.append(deque.pop()).append(", ");
			}
		}
		System.out.println(sb);
	}
}