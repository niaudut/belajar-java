import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {
		
		// membuat variabel dan scanner
		int nilai;
		String grade;
		Scanner scan = new Scanner(System.in);
		
		// mengambil input
		System.out.print("Inputkan nilai: ");
		nilai = scan.nextInt();
		
		// hitung gradenya
		if (nilai <=100 && nilai >= 95) {
			grade = "A+";
			System.out.println("Your Grade is Excellent");			
		}
		else if(nilai <95 && nilai >= 90) {
			grade = "A";
		}
		else if (nilai <90 && nilai >= 80){
			grade = "B+";
		}
		else if (nilai <80 && nilai >= 70){
			grade = "B";
		}
		else if (nilai <70 && nilai >= 60){
			grade = "C+";
		}
		else if (nilai <60 && nilai >= 50){
			grade = "C";
		}
		else if (nilai <50 && nilai >= 40){
			grade = "D";
		}
		else if (nilai <40 && nilai >= 0) {
			grade = "E";
		}else {
			grade = "Data Invalid";
		}
		
		// cetak hasilnya
		System.out.println("Grade: " + grade);
	}
}
