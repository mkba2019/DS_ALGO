import java.util.ArrayList;
import java.util.List;

public class SplitNCharacter {
	 private static String[] splitToNChar(String text, int size) {
		 	List<String> parts = new ArrayList<>();

		 		int length = text.length();
		 			for (int i = 0; i < length; i += size) {
		 					parts.add(text.substring(i, Math.min(length, i + size)));
		 			}
		 			return parts.toArray(new String[0]);
    }

}