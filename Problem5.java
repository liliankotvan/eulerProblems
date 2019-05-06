//Smallest multiple
//Problem 5
//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

public class Problem5{

	public static void main (String[] args){
		int i = 2520;
		boolean found = false;
		while (!found){
			i +=2520;
			boolean divisivel = true;
			for (int j = 11; j <=20; j++){
				if(i % j !=0){		
					divisivel = false;
					break;
				}
			}
			if (divisivel){
				found = true;
			}
		}
		System.out.println(i);		
	}
}