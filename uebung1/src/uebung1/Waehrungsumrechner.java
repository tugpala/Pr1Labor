package uebung1;
import java.util.*;

public class Waehrungsumrechner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Möchten Sie Euro in Dollar oder Dollar in Euro umrechnen?\nGeben Sie 1 ein, um von Euro in Dollar umzurechnen und 2 für Dollar in Euro: ");

		int zahl1 = sc.nextInt();

		if (zahl1 == 1) {
			System.out.println("Geben Sie den Betrag in Euro ein: ");

			double euro = sc.nextDouble();
			double dollar = euro * 1.34;

			System.out.println("Der eingegebene Betrag beträgt in Dollar: " + dollar);
		}

		else {
			System.out.println("Geben Sie den Betrag in Dollar ein: ");

			double dollar = sc.nextDouble();
			double euro = dollar / 1.34;

			System.out.println("Der eingegebene Betrag beträgt in Euro: " + euro);

		}
	}
}
