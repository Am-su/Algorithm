import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int dice1 = Integer.parseInt(st.nextToken());
		int dice2 = Integer.parseInt(st.nextToken());
		int dice3 = Integer.parseInt(st.nextToken());
		
		if(dice1 == dice2 && dice2 == dice3) {
			System.out.println(dice1*1000+10000);
		}
		else if(dice1 != dice2 && dice2 != dice3 && dice1 != dice3) {
			int max = Math.max(dice1, Math.max(dice2, dice3));
			System.out.println(max*100);
		}
		else {
			if(dice2 == dice3){
				System.out.println(dice2*100+1000);
			}
			else {
				System.out.println(dice1*100+1000);
			}
		}
	}
}