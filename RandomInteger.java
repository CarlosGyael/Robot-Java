import java.util.Random;

public final class RandomInteger {

	public int Random() {

		Random randomGenerator = new Random();
	    
		int randomInt = randomGenerator.nextInt(100);
	    
	    return randomInt;
	}
}