import java.util.*;

public class TimeTravellingGardener {
	public int determineUsage(int[] distance, int[] height) {

        int timeTravellingTrees = 0;
        int[] accDist = getAccumulatedDistances(distance);
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                for (int k = j + 1; k < height.length; k++) {
                    int x1 = accDist[i]; int y1 = height[i];
                    int x2 = accDist[j]; int y2 = height[j];
                    int x3 = accDist[k]; int y3 = height[k];
                    if (isCollinear(x1, y1, x2, y2, x3, y3)) {
                        System.out.println("collinear");
                        // do nothing
                    } else {
                        double slope = getSlope(x1, y1, x3, y3);
                        double newHeight = y1 + slope*(x2-x1);
                        if (newHeight > y2) {
                            if (y1 <= (x2-x1)) {
                                timeTravellingTrees++;
                            }
                            if (y3 <= (x3-x2)) {
                                timeTravellingTrees++;
                            }
                        } else {
                            timeTravellingTrees++;
                        }
                    }
                }
            }
        }

        return timeTravellingTrees;
	}

    private int[] getAccumulatedDistances(int [] distances) {
        int[] accDist = new int[distances.length + 1];
        accDist[0] = 0;
        int offset = 1;
        for (int dist: distances) {
            accDist[offset] = accDist[offset-1] + dist;
            offset++;
        }
        return accDist;
    }

    private double getSlope(int x1, int y1, int x2, int y2) {
        return (double) (((double)y1 - (double)y2) / ((double)x1 - (double)x2));
    }

    private boolean isCollinear(int x1, int y1, int x2, int y2, int x3, int y3) {
        return ((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) == 0);
    }
}
