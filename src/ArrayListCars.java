import java.util.ArrayList;

public class ArrayListCars {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("0 - Volvo");
		cars.add("1 - BMW");
		cars.add("2 - Ford");
		cars.add("3 - Mazda");
		cars.add("4 - Toyota");
		cars.add("5 - Honda");
		cars.add("6 - Hyundai");
		
		//cars.set(2, "Mercedez");
		
		//cars.remove(3);
		
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		
		for (String car : cars) {
			System.out.println(car);
		}
	}
}
