package Week01.ConditionalStatements;
import java.util.Scanner;
public class If01 {
    public static void main(String[] args){

        Scanner am = new Scanner(System.in);
        System.out.println("please enter your sales amount:");
        int amount = am.nextInt();

        System.out.printf("Sales amount=%d%n",amount);
        if(amount>=10000){
            System.out.println("Congratulations on achieving the target!");
        }
        am.close();
    }

}
