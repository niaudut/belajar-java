import java.util.Scanner;

public class Suhu {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input Suhu : ");
		int suhu = input.nextInt();

		String category = new Suhu().getCategory(suhu);

		switch (category) {
		case "Beku":
			System.out.println("Suhu " + suhu + " derajat. Kategori Beku dengan range kurang dari 1");
			break;
		case "Dingin":
			System.out.println("Suhu " + suhu + " derajat. Kategori Dingin dengan range 1-10");
			break;
		case "Sejuk":
			System.out.println("Suhu " + suhu + " derajat . Kategori Sejuk dengan range 11-20");
			break;
		case "Sedang":
			System.out.println("Suhu " + suhu + " derajat. Kategori Sedang dengan range 21-25");
			break;
		case "Panas":
			System.out.println("Suhu " + suhu + " derajat. Kategori Panas dengan range 26-99");
			break;
		default:
			System.out.println("Suhu " + suhu + " derajat. Kategori Mendidih dengan range lebih dari 99");
			break;
		}
	}

	private String getCategory(int suhu) {
		if (suhu <= 0)
			return "Beku";
		else if (suhu > 0 && suhu <= 10)
			return "Dingin";
		else if (suhu > 10 && suhu <= 20)
			return "Sejuk";
		else if (suhu > 20 && suhu <= 25)
			return "Sedang";
		else if (suhu > 25 && suhu <= 99)
			return "Panas";
		else
			return "";
	}
}
