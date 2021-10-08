import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int sum;
		for(int i=0;i<3;i++) {
			sum = 0;
			for(int j=0;j<4;j++) {
				sum += sc.nextInt();
			}
			switch(sum) {
			case 4 : 
				sb.append("E"+"\n");
				break;
			case 3 : 
				sb.append("A"+"\n");
				break;
			case 2 : 
				sb.append("B"+"\n");
				break;
			case 1 : 
				sb.append("C"+"\n");
				break;
			case 0 : 
				sb.append("D"+"\n");
				break;
			}
		}
		sc.close();
		System.out.println(sb);
	}
}