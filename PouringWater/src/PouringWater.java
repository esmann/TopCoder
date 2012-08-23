import java.util.*;

public class PouringWater {
	public int getMinBottles(int N, int K) {
        int L = 0;
        int bottleSize = 1;
        int boughtBottles = 0;
        ArrayList<Integer> leftOverBottles = new ArrayList<Integer>();
		while (N != 1) {

            if (N%2 == 1) {
                leftOverBottles.add(bottleSize);
            }
            L = L + N%2;
            N = N/2;
            bottleSize = bottleSize*2;
        }
        if (L+N > K) {
            Integer startSize = leftOverBottles.remove(0);
            boughtBottles += startSize;
            Integer nextBuy = startSize*2;
            if (leftOverBottles.size() > 0) {
                while (leftOverBottles.size() >= K-1 ) {
                    Integer nextSize = leftOverBottles.get(0);
                    if (!nextSize.equals(nextBuy)) {
                        boughtBottles += nextBuy;
                        nextBuy = nextBuy*2;
                    } else {
                        leftOverBottles.remove(0);
                        nextBuy = nextBuy*2;
                    }
                }

            }
        }
        return boughtBottles;
    }
}
