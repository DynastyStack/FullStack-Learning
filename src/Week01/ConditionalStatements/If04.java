package Week01.ConditionalStatements;
import java.util.Scanner;
public class If04 {
    public static void main(String[] args){
        Scanner deg = new Scanner(System.in);

        System.out.println("please enter your electricity consumption:");
        int degree = deg.nextInt();
        System.out.printf("electricity consumption is:%d,%nelectricity bill is %d%n",degree,degree*4);

        if (degree>=500){
            System.out.printf("electricity bill discount 10%% ,after discount is %f dollar",degree*0.9);
        }
        deg.close();
    }
}
