import java.util.*;

// Practice Room 4, SRM 145, Div 2, 500
public class ExerciseMachine {
	public int getPercentages(String time) {
        String[] timeS = time.split(":");
        int seconds = Integer.parseInt(timeS[0])*3600 + Integer.parseInt(timeS[1])*60 + Integer.parseInt(timeS[2]);
        int percentages = 0;
        for (int i = 1; i < 100; i++) {
            if ((seconds * i) % 100 == 0) {
                int factor =(seconds*i/100);
                return percentages = seconds/factor -1;
            }
        }
		return 0;
	}
}
