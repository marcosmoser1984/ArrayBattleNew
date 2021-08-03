package arrayBattle;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;



public class ArrayBattle {
	
	private static final SecureRandom randomNumbers = new SecureRandom();
	public static final int Canada = 13; // each country's power
	public static final int France = 12;// cannot put the same number 
	public static final int Italy = 11;
	
	static int country1 ;
	static int country2 ;
	
	static int victoryCount1;
	static int victoryCount2;
	
	static int[] array;
	static int[] array1;
	
	public ArrayBattle(int country1, int country2) {
		
		this.country1 = country1;
		this.country2 = country2;
	}

	public int getCountry1() {
		return country1;
	}

	public void setCountry1(int country1) {
		this.country1 = country1;
	}

	public int getCountry2() {
		return country2;
	}

	public void setCountry2(int country2) {
		this.country2 = country2;
	}

	public static void fillMilitary1() {
	   switch(country1) {
				
	   case Canada:
    		System.out.printf("Canada ");
    		break;
	   case Italy:
			System.out.printf("Italy  ");
			break;
	   case France:
			System.out.printf("France ");
			break;
				}
		List<Integer> sold1 = new ArrayList<Integer>();
	for (int count= 0; count < country1; count++) {
		
		sold1.add(randomNumbers.nextInt(country1 *10)); //fill in random number with the array length = country number
														//that makes larger number for strongest country	
	  	if(count == country1-1) {
			 array = new int[sold1.size()];  // when the for is done convert List to array.
			for (int i = 0; i < sold1.size(); i++) array[i] = sold1.get(i);
			for(Integer arrPro: array)
			System.out.printf("%3d   ",arrPro);
		}
		
	    }
	    }
	
			
		public static void fillMilitary2() {
		System.out.println();
		switch(country2) {
		
		case Canada:
			System.out.printf("Canada ");
			break;
		case Italy:
			System.out.printf("Italy  ");
			break;
		case France:
			System.out.printf("France ");
			break;
		}
		List<Integer> sold2 = new ArrayList<Integer>();
	for (int count1= 0; count1 < country2; count1++) {
		
		sold2.add(randomNumbers.nextInt(country2 *10));
		
		if(count1 == country2-1) {
			 array1 = new int[sold2.size()];  // when the for is done convert List to array.
			for (int i = 0; i < sold2.size(); i++) array1[i] = sold2.get(i);
			for(Integer arrPro1: array1)// print the array
				System.out.printf("%3d   ", arrPro1);
	}
	}
	
		}	
		
	
	public static void Combat() {
		System.out.println();
		System.out.printf("Result ");
		int combatCount = Math.min(country1, country2); 
		for (int count2 = 0;count2 < combatCount;count2++) {
			if ((array[count2]) > (array1[count2])){          // check the higher random number 
				System.out.printf("%3d   ", array[count2]);
				victoryCount1++;							
			}else if((array[count2]) < (array1[count2])) {
				System.out.printf("%3d   ", array1[count2]);
				victoryCount2++;
			}else if((array[count2])==(array1[count2])) {
				System.out.printf("draw   ");
			}
	}
		int Country_MorePower = Math.max(country1, country2);
		int Country_LessPower = Math.min(country1, country2);
		
		int count3 = Country_MorePower - Country_LessPower;
		
		for (int count4 = 0; count4 < count3; count4++) {    //when the army is larger then the other the strongest army win over
			System.out.print("WO    ");
			if (Country_MorePower == country1){
				victoryCount1++;
			}else {
				victoryCount2++;
			}
		}
	}
	
	public static void CountryVic() {
	 
		if((Math.max(victoryCount1, victoryCount2))== victoryCount1) {
			switch(country1) {
			
			case Canada:
				System.out.println("Canada wins");
				break;
			case Italy:
				System.out.println("Italy wins");
				break;
			case France:
				System.out.println("France wins");
				break;
			}
		} else if ((Math.max(victoryCount1, victoryCount2))== victoryCount2){
             switch(country2) {
			
			case Canada:
				System.out.println("Canada wins");
				break;
			case Italy:
				System.out.println("Italy wins");
				break;
			case France:
				System.out.println("France wins");
				break;
			}
		}else if(victoryCount1 == victoryCount2){
			System.out.println("draw");
		}
			
}


	public static void main(String[] args) {
		ArrayBattle arrBat = new ArrayBattle(Italy, France);// choose two between Canada, France and Italy.
				arrBat.fillMilitary1();
				arrBat.fillMilitary2();
				arrBat.Combat();
				arrBat.CountryVic();
			
		
		
	
	

	
		// TODO Auto-generated method stub

	}

}

