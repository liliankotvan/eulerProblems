//10001st prime
//Problem 7
//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//What is the 10 001st prime number?

public class Problem7{

	public static void main (String[] args){
		int numberTested = 2;	
		int counter = 1;
		int primeNumber = 0;
	
		while (counter <= 10001){
			

			if (isPrimeNumber(numberTested)){
				counter++;
				primeNumber = numberTested;
				System.out.println(numberTested + "  is prime");			
			}
		numberTested++;
		}
		System.out.println("The 10 001st prime number is: " + primeNumber);
		}

		public static boolean isPrimeNumber(int test){
			for (int i = 2 ; i < test; i++){
				if(test % i == 0){
					return false;
				}
			}
			return true;
	}
}