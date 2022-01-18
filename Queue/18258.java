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
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		Integer temp;
		Deque<Integer> queue = new ArrayDeque<>();
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine()," ");
			switch(st.nextToken()) {
			
			case "push":
				queue.add(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				temp = queue.poll();
				if(temp==null)
					sb.append("-1").append("\n");
				else
					sb.append(temp).append("\n");
				break;
			case "size":
				sb.append(queue.size()).append("\n");
				break;
			case "empty":
				if(queue.isEmpty())
					sb.append("1").append("\n");
				else
					sb.append("0").append("\n");
				break;
			case "front":
				temp = queue.peekFirst();
				if(temp==null)
					sb.append("-1").append("\n");
				else
					sb.append(temp).append("\n");
				break;
			case "back":
				temp = queue.peekLast();
				if(temp==null)
					sb.append("-1").append("\n");
				else
					sb.append(temp).append("\n");
				break;
			}
		}
		System.out.println(sb);
	}
}