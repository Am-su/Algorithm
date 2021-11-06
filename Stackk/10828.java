import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.EmptyStackException;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException,EmptyStackException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		StringTokenizer st;
		String inst;
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine()," ");
			inst = st.nextToken();
			if(inst.equals("push")) {
				stack.push(Integer.parseInt(st.nextToken()));
			}
			if(inst.equals("pop")) {
				if(stack.isEmpty()) {
					bw.write(-1+"\n");
				}
				else {
					bw.write(stack.peek()+"\n");
					stack.pop();
				}
			}
			if(inst.equals("size")) {
				bw.write(stack.size()+"\n");
			}
			if(inst.equals("empty")) {
				if(stack.isEmpty()) {
					bw.write(1+"\n");
				}
				else
					bw.write(0+"\n");
			}
			if(inst.equals("top")) {
				if(stack.isEmpty()) {
					bw.write(-1+"\n");
				}
				else {
					bw.write(stack.peek()+"\n");
				}
			}
		}
		br.close();
		bw.close();
	}
}