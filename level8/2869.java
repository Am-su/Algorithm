import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st= new StringTokenizer(br.readLine()," ");
		int a = Integer.parseInt(st.nextToken());//올라감
		int b = Integer.parseInt(st.nextToken());//내려감
		int c = Integer.parseInt(st.nextToken());//나무높이
		int day = 0;							 //일수
		
		if((c-b)%(a-b)==0)
			day = (c-b) / (a-b);
		else
			day = ((c-b)/(a-b)) + 1;
		bw.write(day+"\n");
		br.close();
		bw.close();
	}
}