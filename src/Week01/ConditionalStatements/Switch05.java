package Week01.ConditionalStatements;
import java.util.Scanner;
public class Switch05 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("type Operators:");
        char ope = in.next().charAt(0);

        int a = 10,b=5;

        switch(ope){

            case '+':System.out.printf("10+5=%d",a+b);break;
            case '-':System.out.printf("10-5=%d",a-b);break;
            case '*':System.out.printf("10*5=%d",a*b);break;
            case '/':System.out.printf("10/5=%d",a/b);break;
            default:System.out.println("unsupported operations");
        }



    }
}
