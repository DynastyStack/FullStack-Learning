package Week01.io;

import java.util.Scanner;

public class SystemIn2 {
	public static void main(String[] args) {

		Scanner year = new Scanner(System.in);
		int a = year.nextInt();

		String result = (a >= 18) ? "已滿18" : "未滿18";
		System.out.println(result);
		year.close();
	}

}
