import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		Stack<Character> stack;
		boolean isVPS;
		String str;
		
		for(int i=0;i<n;i++) {
			str = br.readLine();
			isVPS = true;
			stack = new Stack<>();
			
			for(int j=0;j<str.length();j++) {
				if(str.charAt(j)=='(') {
					stack.push('(');
				}
				else if(str.charAt(j)==')') {
					if(!stack.isEmpty())
						stack.pop();
					else {
						isVPS = false;
						break;
					}
				}
			}
			if(!stack.isEmpty()) 
				isVPS = false;
			if(isVPS)
				sb.append("YES").append("\n");
			else
				sb.append("NO").append("\n");
		}
		System.out.println(sb);
	}
}