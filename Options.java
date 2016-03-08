import java.util.Scanner;

public class Options {

	Scanner keyboard = new Scanner(System.in);
	Time Seconds = new Time();
	Battery Life = new Battery();
	int choice = 0;
	boolean TrueUser = true;
	
	public void Menu(){
	

	
	String Arms = "Moves arms";
	String Legs = "Moves legs";
	String Head = "Moves Head";
	
	Seconds.OneSecond();
	
	System.out.println("1. Move arm.");
	System.out.println("2. Move legs");
	System.out.println("3. Move head");
	
	choice = keyboard.nextInt();

		if (choice == 1){
			System.out.println(Arms);
			Life.Battery90();
			
		} else if (choice == 2){
			System.out.println(Legs);
			Life.Battery90();
		} else if (choice == 3){
			System.out.println(Head);
			Life.Battery90();
		}
		
		Seconds.OneSecond();
		
	System.out.println("Now Try another option");
	Seconds.OneSecond();
	System.out.println("1. Move arm.");
	System.out.println("2. Move legs");
	System.out.println("3. Move head");
	
	choice = keyboard.nextInt();

		if (choice == 1){
			System.out.println(Arms);
			Life.Battery80();
		} else if (choice == 2){
			System.out.println(Legs);
			Life.Battery80();
		} else if (choice == 3){
			System.out.println(Head);
			Life.Battery80();
		}
		
		Seconds.OneSecond();
		
	System.out.println("Now Try another option");
	System.out.println("1. Move arm.");
	System.out.println("2. Move legs");
	System.out.println("3. Move head");
	
	choice = keyboard.nextInt();

		if (choice == 1){
			System.out.println(Arms);
			Life.Battery70();
		} else if (choice == 2){
			System.out.println(Legs);
			Life.Battery70();
		} else if (choice == 3){
			System.out.println(Head);
			Life.Battery70();
		}
		
		Seconds.OneSecond();
	}
	
	
	public void SecondMenu(){
		Seconds.OneSecond();
		System.out.println("Main Menu");
		System.out.println("--------");
		System.out.println("1. Start Using Robot");
		System.out.println("2. Change Robot");
		System.out.println("3. Change Username");
		System.out.println("4. Check Rank");
		System.out.println("5. Exit Game");
		choice = keyboard.nextInt();
		
		if (choice ==1){
			Seconds.OneSecond();
			System.out.println("Please use the numbers to control your robot!");
			
		}else if (choice ==2){
			Seconds.OneSecond();
			System.out.println("what kind of robot would you like?");
			System.out.println("1. red");
			System.out.println("2. blue");
			System.out.println("3. green");
		}else if (choice ==3){
			Seconds.OneSecond();
			System.out.println("Redirecting to change username..");
			Seconds.OneSecond();
			TrueUser = false;
		}

	}
}
