package Week01.ConditionalStatements;
import java.util.Scanner;
public class IfElseIf03 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("please enter your body temperature:");

        int bt = in.nextInt();
        System.out.printf("your body temperature is:%d%n",bt);

        if(bt<36){
            System.out.println("body temperature is too low," +
                    "recommended to keep warm.");
        }else if(bt<37.5){
            System.out.println("normal body temperature.");
        }else if(bt<38){
            System.out.println("mild fever, please rest or seeking medical.");
        }else{
            System.out.println("fever,seeking medical immediately.");
        }
        in.close();
    }
}
