//Largest prime factor
//Problem 3
//The prime factors of 13195 are 5, 7, 13 and 29.
//What is the largest prime factor of the number 600851475143 ?


/*-----Solution Provided by ------
-------Lilian Kotvan -----------*/

public class Problem3{

	public static void main (String[] args){
		
		long number = 600851475143L;
		long j = 2;
		long largestPrimeFactor = 0;

		while(j <= number){

			if(number % j == 0 ){
				largestPrimeFactor = j;	
				number = (number/j);
				j = 2;			
			} else j++;
		}
		System.out.println(largestPrimeFactor);
	}
}