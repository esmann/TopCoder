import java.util.*;

// Practice Room 8, SRM 147, Div 2, 250
public class CCipher {
	public String decode(String cipherText, int shift) {

        Byte lowByte = "A".getBytes()[0];
        int low = lowByte.intValue();
        Byte highByte = "Z".getBytes()[0];
        int high = highByte.intValue();
        byte[] cipher = cipherText.getBytes();
        byte[] clearText = new byte[cipher.length];
        for (int i = 0; i < cipher.length; i++) {
            Byte c = cipher[i];
            int d = c.intValue() - shift;
            if (d < low) {
                c = (byte)(high - (low - d)+1);
            } else {
                c = (byte)(c.intValue()-shift);
            }
            clearText[i] = c;
        }
		return new String(clearText);
	}
}
