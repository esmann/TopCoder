/**
 * Created with IntelliJ IDEA.
 * User: Alex Esmann
 * Date: 8/9/12
 * Time: 10:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class KingdomAndTrees {
    public int minLevel(int[] heights) {
        int n = heights.length;
        long[] h = new long[n];
        for (int i = 0; i < n; ++i) h[i] = heights[i];
        long left = -1;
        long right = (long) 1e10;
        while (right - left > 1) {
            long middle = (left + right) /2;
            long min = 0;
            boolean ok = true;
            for (int i = 0; i < n; ++i) {
                min = Math.max(min + 1, h[i] - middle);
                if (min > h[i] + middle)
                    ok = false;
            }
            if (ok)
                right = middle;
            else
                left = middle;
        }
        return (int) right;
    }
}
