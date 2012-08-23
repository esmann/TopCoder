import java.util.*;

// Practice Room 10, SRM 148, Div 2, 250
public class DivisorDigits {
	public int howMany(int number) {

        int n = number;
        int[] digits = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        int divisors = 0;
        int i = 0;
        while (n > 0) {
            digits[i] = n % 10;
            n =  n / 10;
            i++;
        }
        for (int digit: digits) {
            if (digit != 0 && number % digit == 0) {
                divisors++;
            }
        }
		return divisors;
	}
}
