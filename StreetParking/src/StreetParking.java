import java.util.*;
// Practice Room 32, SRM 159 Div 2
public class StreetParking {
	public int freeParks(String street) {
        street = street.replaceAll(".?.?B", "");
        street = street.replaceAll(".?S.?", "");
        street = street.replaceAll("D", "");
		return street.length();
	}
}
