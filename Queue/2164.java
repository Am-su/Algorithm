import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> deque = new ArrayDeque<>();
		int n = Integer.parseInt(br.readLine());
		
		for(int i=1;i<=n;i++) {
			deque.add(i);
		}
		while(true) {
			if(deque.size()==1)
				break;
			deque.pop();
			if(deque.size()==1)
				break;
			int temp = deque.pop();
			deque.add(temp);
		}
		System.out.println(deque.pop());
	}
}