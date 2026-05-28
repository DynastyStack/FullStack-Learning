package Week01.io;

import java.util.Scanner;

public class SystemIn3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("請輸入年齡：");
		int a = in.nextInt();
		in.nextLine();
		System.out.println("是否初次報名：(是/否)");
		String b = in.nextLine();

		String result = (a >= 15 && a <= 29 && b.equals("是")) ? "報名成功" : "不符合資格，報名失敗";
		System.out.println(result);
		in.close();

	}

}
