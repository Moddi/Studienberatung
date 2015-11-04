import java.util.Scanner;

public class Studienberatung {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hast du Abitur? [J/N]");

		String a = scanner.next();	
		if (a.equalsIgnoreCase("j")) {
			System.out.println("Bist du wissbegierig? [J/N]");
			
			String b = scanner.next();
			if (b.equalsIgnoreCase("j")) {
				System.out.println("Auf jeden Fall studieren");
			}
			else {
				System.out.println("Du solltest vielleicht nicht studieren.");
			}
		}
		else if (a.equalsIgnoreCase("n")) {
			System.out.println("Hast du Fachabitur? [J/N]");
			String c = scanner.next();
			
			if (c.equalsIgnoreCase("n")) {
				System.out.println("Du solltest vielleicht nicht studieren.");
			}
			else {
			}
		}
	}
}