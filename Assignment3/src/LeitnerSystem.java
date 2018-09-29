import java.util.Scanner;

public class LeitnerSystem {
	int userChoice;
	Box[] boxes = new Box[] {new Box(), new Box(), new Box(), new Box(), new Box()};
	public void createCard() {
		this.boxes[0].addCard();
	}
	
	public void leitnerSystem() {
		Scanner scanner = new Scanner(System.in);
		while(this.userChoice != 4) {
			FlashCard f = boxes[0].randomCard();
			f.showCard();
			System.out.println("1. Flip the card");
			System.out.println("2. Know the answer");
			System.out.println("3. Don't know the answer");
			System.out.println("4. End session");
			System.out.print("User choice: ");
			this.userChoice = scanner.nextInt();
			if(userChoice == 1) {
				f.flip();
			}
		}
	}
}
