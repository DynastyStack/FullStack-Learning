package Week01.ConditionalStatements;
import java.util.Scanner;
public class If03 {
    public static void main(String[] args){

        Scanner am = new Scanner(System.in);
        System.out.println("please enter your purchase amount:");
        int amount = am.nextInt();

        System.out.printf("purchase amount:%d,shipping fee:%d,total amount:%d%n",
                amount,80,amount+80);
        if (amount>=1000){
            System.out.printf("Shipping costs have been deducted,After discount amount=%d",amount);
        }
        am.close();
    }
}
