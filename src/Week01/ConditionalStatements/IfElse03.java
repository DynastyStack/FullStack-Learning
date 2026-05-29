package Week01.ConditionalStatements;

import java.util.Scanner;

public class IfElse03 {
    public static void main(String[] args) {

        Scanner h = new Scanner(System.in);
        System.out.println("please enter your parking time:");
        int hr = h.nextInt();

        if (hr <= 1) {
            System.out.println("free");
        } else {
            System.out.printf("parking fee:%d", (hr - 1) * 30);
        }
        h.close();
    }
}
