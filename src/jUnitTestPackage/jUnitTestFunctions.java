package jUnitTestPackage;
import java.util.Scanner;

public class jUnitTestFunctions {
	static void AddNumbers() {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int ans=a+b;
		System.out.println(ans);
	}
	static void AddStrings() {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		String ans=a+b;
		System.out.println(ans);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		if (x==1) {
			AddNumbers();
		}
		else if(x==2){
			AddStrings();
		}
	}
}