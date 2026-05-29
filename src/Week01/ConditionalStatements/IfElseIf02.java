package Week01.ConditionalStatements;

import java.util.Scanner;

public class IfElseIf02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("please enter your travel distance:");
        int dist = in.nextInt();

        System.out.printf("your travel distance: is:%d%n", dist);

        if (dist <= 2) {
            System.out.println("Fixed basic fee $100");
        } else if (dist <= 10) {
            System.out.printf("travel distance is:%d", (dist - 2) * 15 + 100);
        } else if (dist <= 20) {
            System.out.printf("travel distance is:%d", (dist - 10) * 20 + 220);
        } else {
            System.out.printf("travel distance is:%d", (dist - 20) * 25 + 420);
        }
        in.close();
    }
}
