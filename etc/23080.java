import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		List<Character> list = new ArrayList<>();
		
		for(int i=0;i<str.length();i++) {
			if(i%n == 0) {
				list.add(str.charAt(i));
			}
		}
		for(Character e : list) {
			System.out.print(e);
		}
	}
}