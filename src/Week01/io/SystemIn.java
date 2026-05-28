package Week01.io;

import java.util.Scanner;

public class SystemIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double result = (a+b+c)/3;
		System.out.println(result);
		sc.close();
		
	}

}
