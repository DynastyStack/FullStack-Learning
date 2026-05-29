package Week01.ConditionalStatements;
import java.util.Scanner;
public class If05 {
    public static void main(String[] args){

        Scanner spen = new Scanner(System.in);
        System.out.println("please enter your annual spending amount:");
        int spending = spen.nextInt();
        System.out.printf("your annual spending is: %d%n",spending);

        if (spending>=50000){
            System.out.printf("VIP members enjoy exclusive gifts(Worth 1000).");

        }

    }
}
