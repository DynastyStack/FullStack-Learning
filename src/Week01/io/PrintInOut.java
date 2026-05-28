package Week01.io;

import java.util.Scanner;

public class PrintInOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("我正在學Java輸出與輸入");
		System.out.println("輸出不算難");
		System.out.println("只需注意差異性\n\n");

		System.out.print("Java");
		System.out.println("好好玩！\n\n");

		String name = "小明";
		int age = 18;
		System.out.printf("姓名:%s,", name);
		System.out.printf("年齡:%d歲\n\n", age);

		Scanner in = new Scanner(System.in);
		System.out.printf("請輸入姓名：");
		String who = in.nextLine();
		System.out.printf("你好，%s", who);
		in.close();

	}

}
