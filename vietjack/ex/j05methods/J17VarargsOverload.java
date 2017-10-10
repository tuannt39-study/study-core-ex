package vietjack.ex.j05methods;

//Cách sử dụng các tham số biến như là một input khi thực hành với overload (nạp chồng) phương thức trong Java?

public class J17VarargsOverload {
	static void vaTest(int... no) {
		System.out.print("vaTest(int ...): " + "Number of args: " + no.length + " Contents: ");
		for (int n : no)
			System.out.print(n + " ");
		System.out.println();
	}

	static void vaTest(boolean... bl) {
		System.out.print("vaTest(boolean ...) " + "Number of args: " + bl.length + " Contents: ");
		for (boolean b : bl)
			System.out.print(b + " ");
		System.out.println();
	}

	static void vaTest(String msg, int... no) {
		System.out.print("vaTest(String, int ...): " + msg + "no. of arguments: " + no.length + " Contents: ");
		for (int n : no)
			System.out.print(n + " ");
		System.out.println();
	}

	public static void main(String args[]) {
		vaTest(1, 2, 3);
		vaTest("Testing: ", 10, 20);
		vaTest(true, false, false);
	}
}
