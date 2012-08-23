import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Practice Room 162 SRM 225 Div 2
public class ParameterSubstitution {
	public String processParams(String code, String[] params) {

        int meh = String.valueOf(params.length).length();
        Pattern pattern = Pattern.compile("\\$([0-9]{1," + meh + "})");
        Matcher matcher = pattern.matcher(code);
        int offset = 0;
        while(matcher.find()) {
            int index = Integer.parseInt(matcher.group().substring(1))-1;
            String regex = Matcher.quoteReplacement(matcher.group());
            if (index < params.length && index > -1) {
                String replacement = params[index].replaceAll("\\$", "æ");
                code = code.replaceAll(regex, Matcher.quoteReplacement(replacement));
            }
        }
		return code.replaceAll("æ", "\\$");
	}
}
