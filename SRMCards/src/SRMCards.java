import java.util.*;

public class SRMCards {
	public int maxTurns(int[] cards) {
        Arrays.sort(cards);
        int maxTurns = cards.length;
        int turns = 0;
        for (int i = 1; i < cards.length; i++) {
            if ((cards[i] - cards[i-1]) == 1) {
                turns++;
            }
        }
		return turns+1;
	}
}
