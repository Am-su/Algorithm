import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int time = 0;
		for(int i=0;i<str.length();i++) {
			time+=num(str.charAt(i));
		}
		System.out.println(time);
		
	}
	public static int num(char a) {
		if(a>='A' && a<='C')
			return 3;
		else if(a>='D' && a<='F')
			return 4;
		else if(a>='G' && a<='I')
			return 5;
		else if(a>='J' && a<='L')
			return 6;
		else if(a>='M' && a<='O')
			return 7;
		else if(a>='P' && a<='S')
			return 8;
		else if(a>='T' && a<='V')
			return 9;
		else if(a>='W' && a<='Z')
			return 10;
		else 
			return 11;
	}
}