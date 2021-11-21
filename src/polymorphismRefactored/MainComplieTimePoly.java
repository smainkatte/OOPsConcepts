package polymorphismRefactored;

import java.util.ArrayList;
import java.util.function.Predicate;

public class MainComplieTimePoly {

	public static void main(String[] args) {

		Predicate<Integer> isDivisibleByThree = n -> Math.abs(n) % 3 == 0;
		ConditionArrayList divisibleByThreeListy = new ConditionArrayList(isDivisibleByThree);
		
		ConditionArrayList divisibleByThreeListy2 = new ConditionArrayList(isDivisibleByThree, 1,2,3,4,5,6,9);
		
		ArrayList<Integer> numsList = new ArrayList<>();
		numsList.add(1);
		numsList.add(4);
		numsList.add(3);
		numsList.add(6);
		numsList.add(13);
		
		ConditionArrayList divisibleByThreeListy3 = new ConditionArrayList(isDivisibleByThree, numsList);
		
		Predicate<Integer> isDivisibleBySix = n -> Math.abs(n) % 6 == 0;
		ConditionArrayList divisibleBySixListy = new ConditionArrayList(isDivisibleBySix, divisibleByThreeListy);

	}

}
