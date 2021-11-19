import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		String[] temp;
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			str = br.readLine();
			temp = str.split(" ");
			
			for(int j=0;j<temp.length;j++) {
				System.out.print(new StringBuffer(temp[j]).reverse()+" ");
			}
			System.out.println();
		}
	}
}