package Week01.ConditionalStatements;
import java.util.Scanner;
public class If02 {
    public static void main(String[] args){

        Scanner v = new Scanner(System.in);
        System.out.println("please enter your driving speed：");
        int speed = v.nextInt();

        System.out.printf("your driving speed is ：%d%n",speed);
        if (speed>60){
            System.out.printf("you have exceed the speed limit, fined %d billion.",(speed-60)*100);
        }
        v.close();
    }

}
