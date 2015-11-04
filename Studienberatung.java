import java.util.Scanner;

public class Studienberatung {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hast du Abitur? [J/N]");

		String a = scanner.next();
		
		if (a.equalsIgnoreCase("j")) {
			System.out.println("Bist du wissbegierig? [J/N]");
			if (a.equalsIgnoreCase("j")) {
				System.out.println("Auf jeden Fall studieren");
			}
			else {
				System.out.println("Nicht studieren.");
			}
		}
		else {
			
		}
	}
}
