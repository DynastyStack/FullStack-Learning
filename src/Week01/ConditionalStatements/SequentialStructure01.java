package Week01.ConditionalStatements;

public class SequentialStructure01 {

    public static void main(String[] args)
    {
       int principle = 10000;
       double interestRate= 0.025;
       double interestAfterYear = principle*interestRate;
       double costAndBenefit = principle*(1+interestRate);

       System.out.printf("Principle:%d%n",principle);
       System.out.printf("Interest rate:%f%n",interestRate);
       System.out.printf("Interest after one year:%s%n",interestAfterYear);
       System.out.printf("Cost and Benefit:%s%n",costAndBenefit);




    }
}
