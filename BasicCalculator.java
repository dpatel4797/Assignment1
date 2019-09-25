package rutgers.edu.A1;
public class BasicCalculator {
	public static void main(String[] args) {
		System.out.println (basicCalculator(18,7,'-'));
	}
	
	/**
	* Input:
	 *      x - an integer
	 *      y - an integer
	 *      op - a character representing an arithmetic operator
	 * Output:
	 *      'x op y'
	 *
	 * Constraints:
	 *      y != 0 if op == '\%' or op == '/'
	 *
	 * This method takes in 3 parameters: x, y, and op.
	 * It returns the result of evaluating the expression 'x op y' if the expression
	 * is valid. Otherwise, it prints an error message and returns -1.
	 *
	 * Examples)
	 *      Ex1) basicCalculator(2, 3, '+') returns 5
	 *      Ex2) basicCalculator(7, 3, '\%') returns 1
	 *      Ex3) basicCalculator(5, 0, '\%') prints an error message and returns -1
	 */

	public static int basicCalculator(int x, int y, char op) {
		if (op == '+')
			return x + y;
		else if (op == '-')
			return x - y;
		else if (op == '*')
			return x * y;
		else if (op == '/' && y != 0)
			return x / y;
		else if (op == '%' && y != 0)
			return x % y;
		else
			return -1;
	}
	
}
