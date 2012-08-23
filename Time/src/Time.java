import java.util.*;
// Practice Room 2, SRM 144, Div 2
public class Time {
	public String whatTime(int seconds) {
        final int hour = 60*60;
        final int minute = 60;

        int hours = seconds / hour;
        int rest = seconds % hour;
        int minutes = rest / minute;
        rest = rest % minute;




		return String.format("%d:%d:%d", hours, minutes, rest);
	}
}
