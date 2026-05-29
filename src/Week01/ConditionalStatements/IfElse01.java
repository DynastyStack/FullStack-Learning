package Week01.ConditionalStatements;

import java.util.Scanner;

public class IfElse01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your score:");
        int score = sc.nextInt();
        if (score >= 60) {
            System.out.println("Pass. No need to retake.");
        } else {
            System.out.println("Fail. Need to retake.");
        }
        sc.close();
    }
}
