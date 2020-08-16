import java.util.*;

public class Dictionary {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Map<String, Object> item = new LinkedHashMap<>();
		String isInput = "Y";
		System.out.println("======== S I M P L E - I N P U T - D A T A ========");
		System.out.println("===================================================");

		while (isInput.equals("Y")) {
			System.out.print("Apakah anda ingin memasukkan data barang baru ? (Y/N) : ");
			isInput = input.nextLine();

			switch (isInput) {
			case "Y":
				new Dictionary().inputData(input, item);
				break;
			case "N":
				new Dictionary().showData(item);
				break;
			default:
				System.out.println("Pilihan anda salah");
			}
		}
	}

	private void inputData(Scanner input, Map<String, Object> item) {
		System.out.print("Nama Barang : ");
		input.nextLine();
		String name = input.nextLine();

		System.out.print("Jumlah : ");
		int quantity = input.nextInt();

		item.put(name, quantity);
	}

	private void showData(Map<String, Object> item) {
		System.out.println("======== D A T A - B A R A N G ========");
		System.out.println("=======================================");
		for (String key : item.keySet()) {
			System.out.println("Nama Barang : " + key + ", Jumlah : " + item.get(key));
		}
	}
}
