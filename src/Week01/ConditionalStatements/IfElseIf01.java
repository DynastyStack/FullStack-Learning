package Week01.ConditionalStatements;

import java.util.Scanner;

public class IfElseIf01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("please enter your score:");
        int score = in.nextInt();

        System.out.printf("your score is:%d%n", score);

        if (score >= 95 && score <= 100) {
            System.out.println("特優獎學金10000元");
        } else if (score >= 90) {
            System.out.println("優等獎學金5000元");
        } else if (score >= 85) {
            System.out.println("甲等獎學2000元");
        } else {
            System.out.println("無獎學金");
        }
        in.close();
    }
}
