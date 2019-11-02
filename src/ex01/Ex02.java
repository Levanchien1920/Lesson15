package ex01;

public class Ex02 {
	public static void main(String[] args) {
		int a = 10, b = 5;
		int c = sub(a, b);
		System.out.println("Hieu:" + c);
	}

	private static int sub(int a, int b) {
		return a - b;
	}
}
