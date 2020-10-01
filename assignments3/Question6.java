package assignments3;
/*Question-6

Scientists estimate that roughly 10 grams of caffeine consumed at one time is a lethal overdose.

Write a program with a variable that holds the number of milligrams of caffeine in a drink and outputs 
how many drinks it takes to kill a person.

       Sample Output

      Number of milligrams in drink: 500
      It would take about 20 drinks for a lethal overdose*/

public class Question6 {
	
	public static void main(String[] args) {
		
		int gramsOfCoffeinInaDrink, miligrams, drinks, overdose;
		
		
		gramsOfCoffeinInaDrink=1;
		miligrams=gramsOfCoffeinInaDrink*1000;
		overdose= 10000;
		drinks=overdose/miligrams;
		
		
		System.out.println("Number of miligrams in drink: " + miligrams);
		System.out.println("It would take about " + drinks + " drinks for a lethal overdose");
		
		
	}

}
