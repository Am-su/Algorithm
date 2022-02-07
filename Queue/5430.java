import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		char[] p;
		StringBuilder sb = new StringBuilder();
		boolean direction;	//참이면 앞에서 뒤로, 거짓이면 뒤에서 앞으로
		for(int i=0;i<T;i++) {
			p = br.readLine().toCharArray();
			int	 n = Integer.parseInt(br.readLine());
			boolean result = true;
			direction = true;
			st = new StringTokenizer(br.readLine(),"[,]");
			Deque<Integer> list = new ArrayDeque<>();
			for(int j=0;j<n;j++) {
				list.offer(Integer.parseInt(st.nextToken()));
			}
			
			int size = list.size();
			for(int k=0;k<p.length;k++) {
				if(p[k]=='R') {
					direction = !direction;
				}
				else {
					if(list.isEmpty()) {
						sb.append("error").append("\n");
						result = false;
						break;
					}
					else {
						if(direction==true)
							list.pollFirst();
						else 
							list.pollLast();
						size--;
					}
				}
			}
			if(result==true) {
				if(size==0) {
					sb.append("[]").append("\n");
				}
				else {
					sb.append("[");
					if(direction==true) {
						for(int k=0;k<size-1;k++) {
							sb.append(list.pollFirst()).append(",");
						}
						sb.append(list.pollFirst()).append("]\n");
					}
					else {
						for(int k=0;k<size-1;k++) {
							sb.append(list.pollLast()).append(",");
						}
						sb.append(list.pollLast()).append("]\n");
					}
				}
			}
		}
		System.out.println(sb);
	}
}