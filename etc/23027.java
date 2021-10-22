import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] list = br.readLine().toCharArray();
		
		if(!hasAlphabet(list,'A')) {
			for(int i=0;i<list.length;i++) {
				if(list[i] == 'B' || list[i] == 'C' || list[i] == 'D' || list[i] == 'F') {
					list[i] = 'A';
				}
			}
		}
		else if(!hasAlphabet(list,'B')) {
			for(int i=0;i<list.length;i++) {
				if(list[i] == 'C' || list[i] == 'D' || list[i] == 'F') {
					list[i] = 'B';
				}
			}
		}
		else if(!hasAlphabet(list,'C')) {
			for(int i=0;i<list.length;i++) {
				if(list[i] == 'D' || list[i] == 'F') {
					list[i] = 'C';
				}
			}
		}
		else {
			for(int i=0;i<list.length;i++) {
				list[i] = 'A';
			}
		}
		for(char e:list) {
			System.out.print(e);
		}
		
	}
	static boolean hasAlphabet(char[] list, char alphabet ) {
		for(int i=0;i<list.length;i++) {
			if(list[i] == alphabet) {
				return false;
			}
		}
		return true;
	}
}