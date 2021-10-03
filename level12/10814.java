import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		Person[] list = new Person[n];
		
		for(int i=0;i<n;i++) {
			list[i] = new Person(sc.nextInt(),sc.next());
		}
		Arrays.sort(list,new Comparator<Person>(){
			
			public int compare(Person p1, Person p2) {
				return p1.age - p2.age;
			}
		});
		for(int i=0;i<n;i++) {
			sb.append(list[i]);
		}
		System.out.println(sb);
	}
	public static class Person{
		int age;
		String name;
		
		public Person(int age, String name) {
			this.age = age;
			this.name = name;
		}
		
		public String toString() {
			return age+" "+name+"\n";
		}
	}
}