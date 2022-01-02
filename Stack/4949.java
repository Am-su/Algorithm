import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] list;
		Stack<Character> stack;
		
		while(true) {
			list = br.readLine().toCharArray();
			if(list[0]=='.' && list.length==1) 
				break;
			stack = new Stack<>();
			int i=0;
			for(i=0;i<list.length;i++) {
				if(list[i] == '(' || list[i] == '[') 
					stack.push(list[i]);
				
				else if(list[i] == ')') {
					if(stack.contains('(') && stack.lastIndexOf('(')>stack.lastIndexOf('['))
						stack.remove(stack.lastIndexOf('('));
					else
						break;
				}
				else if(list[i] == ']') {
					if(stack.contains('[') && stack.lastIndexOf('[')>stack.lastIndexOf('('))
						stack.remove(stack.lastIndexOf('['));
					else
						break;
				}
			}
			if(i == list.length && stack.isEmpty())
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}
}