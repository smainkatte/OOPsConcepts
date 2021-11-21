package polymorphism;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void addRandomNumber(ArrayList<Integer> list) {
		int originalSize = list.size();
		Random random = new Random();
		while(originalSize + 1 != list.size()) {
			int n = random.nextInt(1000);
			list.add(n);
		}
	}

	public static void main(String[] args) {

		OddArrayList oddlisty = new OddArrayList(1,2,3,4,7,9,-13);
		addRandomNumber(oddlisty);
		System.out.println(oddlisty);
		System.out.println(oddlisty.size());


		ArrayList<Integer> listy = new ArrayList<>();
		listy.add(1);
		listy.add(2);
		listy.add(3);
		listy.add(4);
		listy.add(7);
		listy.add(9);
		listy.add(-13);

		addRandomNumber(listy);
		System.out.println(listy);
		System.out.println(listy.size());
	}

}
