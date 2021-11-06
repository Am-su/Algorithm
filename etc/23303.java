import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] list = br.readLine().toCharArray();
		int i;
		for(i=0;i<list.length-1;i++) {
			if(list[i]=='D') {
				if(list[i+1]=='2') {
					System.out.println("D2");
					break;
				}
			}
			else if(list[i]=='d') {
				if(list[i+1]=='2') {
					System.out.println("D2");
					break;
				}
			}
		}
		if(i==list.length-1) {
			System.out.println("unrated");
		}
	}
}