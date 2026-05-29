package Week01.ConditionalStatements;

import java.util.Scanner;

public class IfElse04 {
    public static void main(String[] args) {

        Scanner dep = new Scanner(System.in);
        System.out.println("please enter your deposits:");
        int deposits = dep.nextInt();

        if (deposits >= 50000) {
            System.out.printf("deposit amounts:%d%n" +
                    "interest rate:3%%%n" +
                    "interest:%f", deposits, deposits * 1.03);
        } else {
            System.out.printf("deposit amounts:%d%n" +
                    "interest rate:2%%%n" +
                    "interest:%f", deposits, deposits * 1.02);
        }
        dep.close();
    }
}
