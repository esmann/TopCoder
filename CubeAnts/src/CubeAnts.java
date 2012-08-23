import java.util.*;

public class CubeAnts {
	public int getMinimumSteps(int[] pos) {
        int m = 0;
        for (int p: pos) {
            int s = 0;
            switch(p) {
                case 1:
                case 3:
                case 4:
                    s = 1;
                    break;
                case 2:
                case 5:
                case 7:
                    s = 2;
                    break;
                case 6:
                    s = 3;
            }
            m = Math.max(s, m);
        }
		return m;
	}
}
