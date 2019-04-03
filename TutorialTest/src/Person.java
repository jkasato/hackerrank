import java.util.Scanner;

public class Person {
	private int age;
	
	public Person(int initialAge) {
		// Add some more code to run some checks on initialAge
		// instance variable age
		// constructor takes int initialAge as a paraameter
		// assigns initialAge to age
		// if intialAge is negative, set age to 0 and print Age is not valid, setting
		// age to 0
		// age=initialAge;
		initialAge = age;
		if (initialAge < 0) {
			age = 0;
			System.out.println("Age is not valid, setting age to 0");
			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello, enter your age:");
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
		}
		sc.close();
	}
	
	public void amIOld() {
		// if age<13, print You are young..
		// if age>=13 and age<18, print You a`re a teenager..
		// else, print You are old..
		if (age < 13) {
			System.out.println("You are young..");
		}
		else if (age >= 13 && age < 18) {
			System.out.println("You are a teenager..");
		}
		else {
			System.out.println("You are old..");
		}
	}
	
	public void yearPasses() {
		age++;
	}
}