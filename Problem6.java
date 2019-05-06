
//Sum square difference
//Problem 6
//The sum of the squares of the first ten natural numbers is,
//1^2 + 2^2 + ... + 10^2 = 385
//The square of the sum of the first ten natural numbers is,
//(1 + 2 + ... + 10)^2 = 55^2 = 3025
//Hence the difference between the sum of the squares of the first ten natural numbers and the 
//square of the sum is 3025 - 385 = 2640.
//Find the difference between the sum of the squares of the first one hundred natural numbers
// and the square of the sum.

public class Problem6 {

	public static void main(String[] args) {
		int sumSquareDifference = SquareOf(100) - SumOf(100);
		System.out.println("Result: " +  sumSquareDifference);
	}

	// sum of the squares of the first one hundred natural numbers

	public static int SumOf(int maxNumber) {
		int sumOfSquares = 0;

		for (int number = 1; number <= maxNumber; number++) {

			sumOfSquares = sumOfSquares + (number * number);
		}
		System.out.println("sumOfSquares: " + sumOfSquares);
		return sumOfSquares;
	}

	// square of the sum of the first one hundred natural numbers

	public static int SquareOf(int maxNumber) {
		int squareOfSum = 0;

		for (int auxNumber = 1; auxNumber <= maxNumber; auxNumber++) {

			squareOfSum += auxNumber;
		}
		squareOfSum *= squareOfSum;
		System.out.println("squareOfSum: " + squareOfSum);
		return squareOfSum;
	}

}