import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int work = 0, tired = 0, time = 0;
		
		if(A>M)
			System.out.println(0);
		else {
			while(time<24) {
				if(tired+A > M) {
					time++;
					tired-=C;
				}
				else {
					tired +=A;
					work +=B;
					time++;
				}
			}
			System.out.println(work);
		}
	}
}