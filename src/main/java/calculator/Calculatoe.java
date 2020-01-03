package calculator;

public class Calculatoe {
	/***
	 * @author AWAIS Sarwar Fa16-bse015
	 * The findMax method will find max b/w given three integers numbers
	 * @param num1 is the first integer number
	 * @param num2  is the second integer number
	 * @param num3 is  the third integer number
	 * @return the max integer
	 */
	public int findMax(int num1, int num2, int num3) {
		int[] arr = { num1, num2, num3 };
		int max = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}
	/**
	 * The method square calculates the square of a positive integer, which is 
       * less than ten
	 * @param the input integer
	 * @return is the square of the input integer
	 * @throws the IllegalArgumentException when the input integer is not 
       * between 0 and 10
	 */
	public int square(int num) throws IllegalArgumentException {
		int result = 0;
		if (num > 0 && num < 10) {
			result = num * num;
		} else
			throw new IllegalArgumentException();
		return result;
	}
	/**
	 * This method mycube calculates the cube of an integer
	 * @param is num input integer
	 * @return is  the cube of the input integer
	 */
	public int mycube(int num){
		return (num*num*num);
	}
}
