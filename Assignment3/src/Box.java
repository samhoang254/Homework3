import java.util.Random;
import java.util.Scanner;

public class Box {
	FlashCard[] cards = new FlashCard[20];
	
	public Box(){
	}
	
	public void addCard() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the front side info");
		String front  = scanner.nextLine();
		System.out.println("Please enter the back side info");
		String back = scanner.nextLine();
		
		for(int i = 0; i < this.cards.length; i++) {
			if(this.cards[i] == null) {
				this.cards[i] = new FlashCard(front, back);
				break;
			}
		}
		
	}
	
	public FlashCard randomCard() {
		Random random = new Random();
		int count = 0;
	    for(FlashCard el : cards)
	        if (el != null)
	            ++count;
	    System.out.println(Integer.toString(count)+ " This is count");
	    int randomNumber = random.nextInt(((count - 0) + count) + 0);
	    System.out.println(Integer.toString(randomNumber) + " This is random number");
		return this.cards[randomNumber];
	}
}
