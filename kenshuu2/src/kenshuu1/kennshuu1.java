package kenshuu1;

public class kennshuu1 {
	public static void main(String[] args) {
		System.out.println("西暦年を入力します。");
		int year = new java.util.Scanner(System.in).nextInt();
		System.out.println(year);

		if (year % 4 == 0) {
			System.out.println("うるう年です");
		}
		else if (year % 100 == 0) {
			System.out.println("うるう年でない");
		}
		else if (year % 400 == 0) {
			System.out.println("うるう年です");
		}
		else {
			System.out.println("うるう年でない");
		}
	}
}
