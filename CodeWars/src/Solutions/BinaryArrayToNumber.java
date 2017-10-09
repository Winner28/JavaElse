package Solutions;

import java.util.List;

/**
 * @author vlaDey
 */

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int result = 0;

        for (int i = 0; i<binary.size(); i++) {
            if (binary.get(i) == 1)
            result+=Math.pow(2,binary.size()-i-1);
        }

        return result;
    }
}