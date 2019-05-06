//Largest palindrome product
//Problem 4
//A palindromic number reads the same both ways. 
//The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

//Find the largest palindrome made from the product of two 3-digit numbers.

public class Problem4{

	public static void main (String[] args){

	int palindrome = 0;
	int largestNumberOne = 0;
	int largestNumberTwo = 0;
	
	for (int numberOne = 999; numberOne > 99; numberOne--){
		for (int numberTwo = 999; numberTwo > 99; numberTwo--){
			int product = numberOne * numberTwo;

			if (isPalindrome (product)){
				if (product > palindrome){
					palindrome = product;
					largestNumberOne = numberOne;
					largestNumberTwo = numberTwo;
				}
			}
		}
	}
				String text = "Largest Palindrome: %s x %s = %s";
				System.out.printf(text, largestNumberOne , largestNumberTwo, palindrome);
	}

	static boolean isPalindrome (int number){
		int auxNumber = number;
		int reversedNumber = 0;

		while (auxNumber > 0){
			reversedNumber = reversedNumber *10 + auxNumber%10;
			auxNumber /= 10;
		}
		return number == reversedNumber;
	}
}

//


