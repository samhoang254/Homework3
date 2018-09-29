import java.util.Random;

public class FlashCard {
	String front;
	String back;
	int fb;
	public FlashCard(String front, String back) {
		this.front = front;
		this.back = back;
	}
	
	public void showCard() {
		Random random = new Random();
		if (random.nextInt((1 - 0) + 1) + 0 == 0) {
			System.out.println(this.front);
			this.fb = 0;
		}
		else {
			System.out.println(this.back);
			this.fb = 1;
		}
	}
	
	public void flip() {
		if (this.fb == 0) {
			System.out.println(this.back);
			this.fb = 1;
		}
		else {
			System.out.println(this.front);
			this.fb = 0;
		}
	}
}
