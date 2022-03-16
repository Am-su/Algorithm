import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int n = Integer.parseInt(str);
		long result = 0;
		int mul = 0;
		
		for(int i=1;i<str.length();i++) {
			mul = (mul*10) + 9;
		}
		
		if(str.length()==1) {
			System.out.println(n);
		}
		else {
			for(int i=str.length();i>0;i--) {
				int temp = n-mul;
				result += (temp*i);
				n = mul;
				mul/=10;
			}	
			System.out.println(result);
		}
		
	}
}