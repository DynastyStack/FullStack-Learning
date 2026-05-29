package Week01.ConditionalStatements;

public class SequentialStructure04 {
    public static void main(String[] args){

        int ori = 3725;
        int h = ori/3600;
        int m = (ori%3600)/60;
        int s = (ori%3600)%60;

        System.out.printf("%d hr %d min %d s",h,m,s);
    }
}
