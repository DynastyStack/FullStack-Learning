package Week01.ConditionalStatements;
import java.util.Scanner;
public class Switch04 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("please enter your score:");
        String score = in.nextLine();

        switch(score){
            case "A":System.out.println("90-100 points, excellent");break;
            case "B":System.out.println("80-89 points, good");break;
            case "C":System.out.println("70-79 points, pass");break;
            case "D":System.out.println("60-69 points, need to improve");break;
            case "F":System.out.println("fail");break;
            default:System.out.println("invalid grade");



        }


    }
}
