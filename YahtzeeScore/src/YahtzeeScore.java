import java.util.*;

// Practice Room 6, SRM 146, Div 2, 250
public class YahtzeeScore {
	public int maxPoints(int[] toss) {
        int[] scores = {0, 0, 0, 0, 0, 0};
        for (int die: toss) {
            scores[die-1] += die;
        }

        int result = 0;
        for (int score: scores) {
            result = Math.max(result, score);
        }
		return result;
	}
}
