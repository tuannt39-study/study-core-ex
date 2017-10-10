package vietjack.ex.j05methods;

//Cách sử dụng phương thức để tính chuỗi Fibonacci trong Java?

public class J04Fibonacci {
	public static long fibonacci(long number) {
		if ((number == 0) || (number == 1))
			return number;
		else
			return fibonacci(number - 1) + fibonacci(number - 2);
	}

	public static void main(String[] args) {
		for (int counter = 0; counter <= 10; counter++) {
			System.out.printf("Fibonacci of %d is: %d\n", counter, fibonacci(counter));
		}
	}
}
