import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num,i;
		String str;
		char[] cha;
		
		while(true) {
			str = br.readLine();
			num = Integer.parseInt(str);
			if(num==0)
				break;
			else {
				cha = str.toCharArray();
			}
			for(i=0;i<cha.length/2;i++) {
				if(cha[i] != cha[cha.length-i-1])
					break;
			}
			if(i==cha.length/2)
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}
}