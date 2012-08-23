import java.util.*;

// Practice Room 162 SRM 225 Div 2
public class SignatureDecorator {
    public String applyDecoration(String name, String[] commands, String[] decorations) {

        for (int i = 0; i < commands.length; i++) {
            if (commands[i] == "append") {
                name = name + decorations[i];
            } else if (commands[i] == "prepend") {
                name = decorations[i] + name;
            } else if (commands[i] == "surround") {
                name = decorations[i] + name + reverse(decorations[i]);
            }
        }
        return name;
    }

    private String reverse(String text) {
        char[] meh = text.toCharArray();
        for (int i = 0; i < meh.length / 2; i++) {
            char temp = meh[i];
            meh[i] = meh[meh.length - 1 - i];
            meh[meh.length - 1 - i] = temp;
        }
        return String.copyValueOf(meh);
    }
}
