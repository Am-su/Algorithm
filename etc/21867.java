import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		for(int i=0;i<n;i++) {
			if(str.charAt(i) != 'J' &&str.charAt(i) != 'V' &&str.charAt(i) != 'A') {
				sb.append(str.charAt(i));
			}
		}
		if(sb.isEmpty())
			System.out.println("nojava");
		else
			System.out.println(sb);	
	}
}