package docsconsole;

import java.util.*;
import java.util.function.Consumer;

public class ListIterationExample {

	public static void main(String[] args) {

		List<String> carBrands = new ArrayList<String>();
		carBrands = Arrays.asList("Maruti Suzuki", "MG Motor", "Hyundai", "Toyota", "Mahindra", "Tata", "Kia", "Volkswagen");

		//for loop
		System.out.println(">>>>>>>>>>>>>for loop example");
		for(int i=0;i<carBrands.size();i++){
			System.out.println(carBrands.get(i));
		}

		//while loop
		System.out.println(">>>>>>>>>>>>>while loop example");
		int i = 0;
		while(i<carBrands.size()){
			System.out.println(carBrands.get(i));
			i++;
		}

		//forEach loop
		System.out.println(">>>>>>>>>>>>>forEach loop example");
		carBrands.forEach(System.out::println);
		System.out.println("\n");

		//enhanced for loop
		System.out.println(">>>>>>>>>>>>>enhanced for loop example");
		for (String temp : carBrands) {
			System.out.println(temp);
		}

		//iterator
		System.out.println(">>>>>>>>>>>>>iterator for loop example");
		Iterator iterator = carBrands.iterator();
		while (iterator.hasNext()){
			System.out.println(iterator.next());
		}
		//list iterator
		System.out.println(">>>>>>>>>>>>>listIterator for loop example");
		ListIterator listIterator = carBrands.listIterator();
		while (listIterator.hasNext()){
			System.out.println(listIterator.next());
		}
		//foreach with stream
		System.out.println(">>>>>>>>>>>>>foreach with stream example");
		carBrands.stream().forEach(System.out::println);

	}

}