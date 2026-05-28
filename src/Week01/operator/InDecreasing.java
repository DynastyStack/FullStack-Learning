package Week01.operator;

public class InDecreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ticketNumber = 0;

		System.out.printf("第%d位客人，您抽到的是%d號%n", ++ticketNumber, ticketNumber);
		System.out.printf("第%d位客人，您抽到的是%d號%n", ++ticketNumber, ticketNumber);
		System.out.printf("第%d位客人，您抽到的是%d號%n", ++ticketNumber, ticketNumber);
		System.out.printf("第%d位客人，您抽到的是%d號%n", ++ticketNumber, ticketNumber);
		System.out.printf("第%d位客人，您抽到的是%d號%n", ++ticketNumber, ticketNumber);
		System.out.printf("今日已發出%d張號碼牌%n%n", ticketNumber);

		int hp = 10;
		System.out.printf("受到攻擊！剩餘生命%d%n", --hp);
		System.out.printf("受到攻擊！剩餘生命%d%n", --hp);
		System.out.printf("受到攻擊！剩餘生命%d%n%n", --hp);
		System.out.printf("戰鬥結束！剩餘生命%d%n%n", hp);
		
		int countDown = 5;
		System.out.printf("倒數 %d%n",countDown--);
		System.out.printf("倒數 %d%n",countDown--);
		System.out.printf("倒數 %d%n",countDown--);
		System.out.printf("倒數 %d%n",countDown--);
		System.out.printf("倒數 %d%n",countDown--);
		System.out.printf("0,火箭發射！");

	}

}
