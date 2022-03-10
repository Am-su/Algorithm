import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		
		while((str = br.readLine()) != null) {
			long temp = 0;
			int num = Integer.parseInt(str);
			
			for(int i=1;i<=num;i++) {
				temp = temp*10 + 1;
				temp %=num;
				if(temp % num == 0) {
					System.out.println(i);
					break;
				}
			}	
		}
	}
}