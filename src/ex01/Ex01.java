package ex01;

import java.util.function.BiFunction;

public class Ex01 {
	public static void main(String[] args) {
		int a = 5, b = 10;
		int c = sum(a, b);
		System.out.println("Tong:" + c);
		int d = mul(a, b);
		System.out.println("Tich:" + d);
		lambda();
	}

	private static int sum(int a, int b) {
		return a + b;
	}

	private static int mul(int a, int b) {
		return a * b;
	}
	private static void lambda() {
		BiFunction<Double, Double, Double> sum = (a,b)->a+b;
		BiFunction<Double, Double, Double> sub = (a,b)->a-b;
		BiFunction<Double, Double, Double> mul = (a,b)->a*b;
		BiFunction<Double, Double, Double> div = (a,b)->a/b;
	}
}
