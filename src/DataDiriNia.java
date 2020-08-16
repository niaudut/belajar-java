import java.util.Scanner;

public class DataDiriNia {
	public static void main(String[] args) {
		String nama = "";
		String alamat = "";
		String telp = "";
		String gender = "";

		Scanner input = new Scanner(System.in);

		while (nama.isBlank()) {
			System.out.print("Input Nama : ");
			nama = input.nextLine().trim();
		}

		while (alamat.isBlank()) {
			System.out.print("Input Alamat : ");
			alamat = input.nextLine().trim();
		}

		while (telp.isBlank()) {
			System.out.print("Input No.Telp : ");
			telp = input.nextLine().trim();
		}

		while (gender.isBlank()) {
			System.out.print("Input Jenis Kelamin [L/P] : ");
			gender = input.nextLine().trim();

			if (gender.equalsIgnoreCase("L") || gender.equalsIgnoreCase("P")) {
				
			} else {
				System.err.println("Jenis Kelamin salah input!!!");
				gender ="";
			}
		}

		System.out.println("");
		System.out.println("Nama : " + nama);
		System.out.println("Alamat : " + alamat);
		System.out.println("No.Telp : " + telp);
		System.out.println("Jenis Kelamin " + gender);
	}
}
