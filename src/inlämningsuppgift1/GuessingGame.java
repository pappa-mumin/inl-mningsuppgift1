package inlämningsuppgift1;

public class GuessingGame {

	public static void main(String[] args) {

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		Guesser guesser = new Guesser(a, b);
		
		guesser.start();
	}

}
