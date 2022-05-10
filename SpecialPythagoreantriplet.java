import java.util.*;
public class SpecialPythagoreantriplet {

	private static long triplets(int limit) {
		long answer = 0;

		for (int a = 3; a < limit; a++) {

			for (int b = a + 1; b < limit; b++) {

				double c = Math.pow(a, 2) + Math.pow(b, 2);
				c = Math.sqrt(c);

				if ((a + b + c) == limit) {
					answer = (long) (a * b * c);
					break;
				}
			}
		}
		return answer;
}