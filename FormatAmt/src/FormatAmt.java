// Practice Room 12, SRM 149, Div 2, 250
public class FormatAmt {
	public String amount(int dollars, int cents) {
        //int[] t = {0, 0, 0, 0};
        int t;
        String result = "";
        while (dollars > 0) {
            t = dollars % 1000;
            dollars = dollars / 1000;

            result = ((t == 0) ? "000" : t) + "," + result;
        }
        if (result.equals("")) {
            result = "0,";
        }
		return "$" + result.substring(0, result.length()-1) + "." + ((cents < 10) ? "0" + cents : cents);
	}
}
