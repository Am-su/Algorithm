import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] list = br.readLine().toCharArray();
		int oneCount = 0;
		int zeroCount = 0;
		
		if(list[0] == '1')
			oneCount++;
		else
			zeroCount++;
		for(int i=1;i<list.length;i++) {
			if(list[i] != list[i-1]) {
				if(list[i] == '1')
					oneCount++;
				else
					zeroCount++;
			}
		}
		System.out.println(Math.min(oneCount, zeroCount));
	}
}