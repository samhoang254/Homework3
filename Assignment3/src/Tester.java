import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Tester {

	public static void main(String[] args) {
//		String front = "hi";
//		String back = "bye";
//		FlashCard f1 = new FlashCard(front, back);
//		f1.showCard();
//		f1.showCard();
//		f1.showCard();
//		f1.showCard();
//		f1.showCard();
//		f1.showCard();
//		f1.showCard();
//		f1.showCard();
//		f1.showCard();
//		f1.showCard();
//		f1.showCard();
//		f1.showCard();
//		f1.showCard();
//		f1.showCard();
//		
//		Random rand = new Random();
//		int max = 1;
//		int min = 0;
//		System.out.println(rand.nextInt((max - min) + 1) + min);
//		System.out.println(rand.nextInt((max - min) + 1) + min);
//		System.out.println(rand.nextInt((max - min) + 1) + min);
//		System.out.println(rand.nextInt((max - min) + 1) + min);
//		System.out.println(rand.nextInt((max - min) + 1) + min);
//		System.out.println(rand.nextInt((max - min) + 1) + min);
//		System.out.println(rand.nextInt((max - min) + 1) + min);
//		System.out.println(rand.nextInt((max - min) + 1) + min);
//		
//		
//		FlashCard[] cards = new FlashCard[20];
//		System.out.println(Arrays.toString(cards));
//		int[] a = new int[20];
//		a[0] = 1;
//		System.out.println(Arrays.toString(a));
//		a[1] = 2;
//		System.out.println(Arrays.toString(a));
//		Box box1 = new Box(1);
//		box1.addCard();
//		box1.addCard();
//		box1.addCard();
//		box1.addCard();
//		box1.addCard();
//		box1.addCard();
//		box1.addCard();
//		box1.addCard();
//		box1.addCard();
//		box1.leitnerSystem();
//		box1.cards[0].showCard();
//		box1.cards[0] = null;
//		Random random = new Random();
//		FlashCard[] cards = new FlashCard[20];
//		cards[0] = new FlashCard("Yo", "mama");
//		int randomNumber;
//		for(int i = 0; i < 50; i++) {
//			int count = 0;
//		    for(FlashCard el : cards)
//		        if (el != null)
//		            ++count;
////		    System.out.println(count);
//		    randomNumber = random.nextInt(((count - 0) + count) + 0);
//		    System.out.println(randomNumber);
//		}
		LeitnerSystem ls = new LeitnerSystem();
		ls.createCard();
		ls.createCard();
		ls.createCard();
		ls.leitnerSystem();
		
//		int count = 0;
//	    for(FlashCard el : cards)
//	        if (el != null)
//	            ++count;
//		System.out.println(cards.length);
//		System.out.println(count);
	}
}
