//帶參數且有回傳值的方法
package Week01.operator;

public class Calculate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result1 = add(10, 20);
		int result2 = subtract(100, 35);
		int result3 = multiply(5, 6);

		System.out.println(" 10 + 20 = " + result1);
		System.out.println(" 100 - 35 = " + result2);
		System.out.println(" 5 = 6 " + result3);
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int subtract(int a, int b) {
		return a - b;
	}

	public static int multiply(int a, int b) {
		return a * b;
	}

}
