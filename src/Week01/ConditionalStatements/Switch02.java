package Week01.ConditionalStatements;
import java.util.Scanner;
public class Switch02 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("please enter month number:");
        int m = in.nextInt();

        switch(m){
            case 1,3,5,7,8,10,12:System.out.printf("%d月有31天.",m);break;
            case 4,6,9,11:System.out.printf("%d月有30天.",m);break;
            case 2 :System.out.println("2月有28天.");break;
            default:System.out.println("month isn't exist");
        }

    }
}
