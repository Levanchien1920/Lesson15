package ex01;

public class Ex01 {
	public static void main(String[] args) {
		int a = 5, b = 10;
		int c = sum(a, b);
		System.out.println("Tong:" + c);
		int d = mul(a, b);
		System.out.println("Tich:" + d);
	}

	private static int sum(int a, int b) {
		return a + b;
	}

	private static int mul(int a, int b) {
		return a * b;
	}
}
