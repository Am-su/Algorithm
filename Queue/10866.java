import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> queue = new ArrayDeque<>();
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		while(n>0) {
			st = new StringTokenizer(br.readLine()," ");
			switch(st.nextToken()) {
			case "push_front":
				queue.offerFirst(Integer.parseInt(st.nextToken()));
				n--;
				break;
			case "push_back":
				queue.offerLast(Integer.parseInt(st.nextToken()));
				n--;
				break;
			case "pop_front":
				if(!queue.isEmpty())
					sb.append(queue.pollFirst()).append("\n");
				else
					sb.append(-1).append("\n");
				n--;
				break;
			case "pop_back":
				if(!queue.isEmpty())
					sb.append(queue.pollLast()).append("\n");
				else
					sb.append(-1).append("\n");
				n--;
				break;
			case "size":
				sb.append(queue.size()).append("\n");
				n--;
				break;
			case "empty":
				if(queue.isEmpty())
					sb.append(1).append("\n");
				else
					sb.append(0).append("\n");
				n--;
				break;
			case "front":
				if(!queue.isEmpty())
					sb.append(queue.peekFirst()).append("\n");
				else
					sb.append(-1).append("\n");
				n--;
				break;
			case "back":
				if(!queue.isEmpty())
					sb.append(queue.peekLast()).append("\n");
				else
					sb.append(-1).append("\n");
				n--;
				break;
			}
		}
		System.out.println(sb);
	}
}