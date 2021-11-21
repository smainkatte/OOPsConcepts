package polymorphismRefactored;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void addRandomNumber(ArrayList<Integer> list) {
		int originalSize = list.size();
		Random random = new Random();
		int n = random.nextInt(1000);
		
		if (list instanceof ConditionArrayList ) {
			ConditionArrayList conditionList = (ConditionArrayList) list;
			while(!conditionList.isEligible(n)) {
				n = random.nextInt(1000);
			}
		}
			list.add(n);
		
	}

	public static void main(String[] args) {

		ConditionArrayList oddlisty = new ConditionArrayList(n -> Math.abs(n) % 2 == 1);
		oddlisty.add(1);
		oddlisty.add(2);		
		addRandomNumber(oddlisty);
		System.out.println(oddlisty);
		System.out.println(oddlisty.size());

		
		ConditionArrayList evenlisty = new ConditionArrayList(n -> Math.abs(n) % 2 == 0);
		evenlisty.add(1);
		evenlisty.add(2);		
		addRandomNumber(evenlisty);
		System.out.println(evenlisty);
		System.out.println(evenlisty.size());
		

		ArrayList<Integer> listy = new ArrayList<>();
		listy.add(1);
		listy.add(2);	
		addRandomNumber(listy);
		System.out.println(listy);
		System.out.println(listy.size());
	}

}
