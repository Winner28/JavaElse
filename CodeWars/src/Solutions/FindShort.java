package Solutions;

/**
 * @author vlaDey
 */
public class FindShort {
    public static int findShort(String s) {
        String []resultString = s.split(" ");
        int min = 100000;
        for (int i =0; i<resultString.length; i++) {
            if (resultString[i].length() < min) {
                min = resultString[i].length();
            }
        }
        return min;
    }
}
