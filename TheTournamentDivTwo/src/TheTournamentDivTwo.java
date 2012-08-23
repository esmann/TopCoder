import java.util.*;

public class TheTournamentDivTwo {
	public int find(int[] points) {
        Arrays.sort(points);
        int totalWins = 0;
        int totalDraws = 0;
        for (int teamScore : points) {
            totalWins += teamScore/2;
            totalDraws += teamScore%2;
        }
        if (totalDraws%2 != 0) {
            return -1;
        }
        return (totalWins - (totalDraws/2) + totalDraws);
	}
}
