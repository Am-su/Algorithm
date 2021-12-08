import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int A = Integer.parseInt(st.nextToken());	//쌓이는 피로도
		int B = Integer.parseInt(st.nextToken());	//일처리
		int C = Integer.parseInt(st.nextToken());	//쉬면 줄어드는 피로도
		int M = Integer.parseInt(st.nextToken());	//최대 피로도
		int work = 0, tired = 0, time = 0;
		
		if(A>M)
			System.out.println(0);
		else {
			while(time<24) {
				if(tired<0)
					tired = 0;
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