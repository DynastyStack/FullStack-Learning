package Week01.ConditionalStatements;
import java.util.Scanner;
public class Switch03 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("type transportation");
        String tra = in.nextLine();

        switch(tra){
            case "bicycle" :System.out.println("30 km/h");break;
            case "car" :System.out.println("200 km/h");break;
            case "train" :System.out.println("300 km/h");break;
            case "airplane" :System.out.println("900 km/h");break;
            default:System.out.println("unknown transportation");
        }

    }
}
