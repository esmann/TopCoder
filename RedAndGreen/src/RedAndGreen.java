// Practice Room 766 SRM 521 DIV 2

public class RedAndGreen {
	public int minPaints(String row) {
        //char[] squares = row.toCharArray();
        int moves = 0;
        int start = row.indexOf("G");
        row = row.substring(start + 1);
        int index = row.indexOf("R");
        while (index != -1) {
            row = row.substring(index + 1);
            index = row.indexOf("R");
            moves++;
        }
		return moves;
	}
}
