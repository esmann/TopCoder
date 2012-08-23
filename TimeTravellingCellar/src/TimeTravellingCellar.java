
public class TimeTravellingCellar {
	public int determineProfit(int[] profit, int[] decay) {
        int maxProfit = 0;
        for (int i = 0; i < profit.length; i++) {
            int currentProfit = profit[i];
            for (int j = 0; j < decay.length; j++) {
                int currentDecay = decay[j];
                int tempProfit = currentProfit - currentDecay;
                if (tempProfit > maxProfit && j != i) {
                    maxProfit = tempProfit;
                }
            }
        }
		return maxProfit;
	}
}
