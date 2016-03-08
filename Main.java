import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String Username;
		int choice =0;
		int Battery = 100;
		int RobotWidth = 5;
		int RobotHeight = 10;
		boolean run = true;
		boolean TrueUser = true;
		boolean SecondMenu = true;
		
		Time Seconds = new Time();
		Options SecOptions= new Options ();
		Options GetOptions = new Options();
		RandomInteger GetRandom = new RandomInteger();
		Battery Life = new Battery();
		
		int Name = GetRandom.Random();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hello my name is #" + Name+".");
		Seconds.OneSecond();
		System.out.println("My Height is "+ RobotHeight+ ".");
		Seconds.OneSecond();
		System.out.println("My Width is "+ RobotWidth+ ".");
		Seconds.OneSecond();
		
		Life.Battery100();
		Seconds.OneSecond();
		System.out.println("Like a average robot.");
		Seconds.OneSecond();
		System.out.println("Please make sure robot: #" +Name+" Works.");
		System.out.println("----------------------------------");
		
		
		GetOptions.Menu();
		
		
		
		System.out.println("Very good!");
		Seconds.OneSecond();
		System.out.println("Robot #" + Name +" Works perfectly, now lets compare it to other robots!");
		Seconds.OneSecond();
		

			System.out.println("Please enter a Username: ");
			Username = keyboard.next();
			Seconds.OneSecond();
			System.out.println("Welcome "+ Username +" to Robot League!");
			Seconds.OneSecond();
			System.out.println("You will now have the option to control your robot!");
			Seconds.OneSecond();
			System.out.println("You will now be taken to the Main Menu!");
			Seconds.OneSecond();
			System.out.println("Main Menu");
			System.out.println("--------");
			System.out.println("1. Start Using Robot");
			System.out.println("2. Change Robot");
			System.out.println("3. Change Username(not working)");
			System.out.println("4. Exit Game");
			choice = keyboard.nextInt();
			
			if (choice ==1){
				Seconds.OneSecond();
				for (int feetTraveled = 0; feetTraveled <= 100; feetTraveled +=10){
					System.out.println("I have traveled" + feetTraveled+" feet");
					
					if (feetTraveled ==100);
					System.out.println("Youve reached your limit");
					
					Seconds.TwoSeconds();
					
					System.out.println("Must Recharge");
					
					for (int power = 0; power <= 100; power += 10){
						System.out.println("My power is charging up " +power);
						
						if (power == 100){
							System.out.println("Fully charged (:");
						}
					}
				}
				
			}else if (choice ==2){
				Seconds.OneSecond();
				System.out.println("what kind of robot would you like?");
				System.out.println("1. red");
				System.out.println("2. blue");
				System.out.println("3. green");
				
			}else if (choice ==3){
				Seconds.OneSecond();
				System.out.println("Redirecting to change username..");
				
			
			}else if (choice ==4){
				System.out.println("End of Game");
				try {
					Thread.sleep(60000);                 //1000 milliseconds is one second.
				} catch(InterruptedException ex) {
					Thread.currentThread().interrupt();
				}
	
		

			}

	}
}
