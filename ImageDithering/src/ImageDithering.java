import java.util.*;
// Practice Room 4, SRM 145, Div 2, 250
public class ImageDithering {
	public int count(String dithered, String[] screen) {
        char[] ditheredChars = dithered.toCharArray();
        int length = 0;
        for (char dChar: ditheredChars) {
            for (String s: screen) {
                int l = s.length();
                s = s.replaceAll(String.valueOf(dChar), "");
                length += l - s.length();
            }

        }
		return length;
	}
}
