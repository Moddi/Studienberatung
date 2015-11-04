import java.util.Scanner;

public class Studienberatung {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Hast du Abitur? [J/N]");

		String a = scanner.next();
		if (a.equalsIgnoreCase("n")) {
			System.out.println("Hast du Fachabitur? [J/N]");
			String a = scanner.next();
			
			if (a.equalsIgnoreCase("n")) {
				System.out.println("Du solltest nicht studieren");
			}
			else {
			
			}
		}
		else {
			
		}
	}
}
