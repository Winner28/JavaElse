package Solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vlaDey
 */
//not good

public class Consecutives {

    public static List<Integer> sumConsecutives(List<Integer> s) {

        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < s.size(); i++) {
            int result = s.get(i);
            if (i + 1 == s.size() && !(s.get(i).equals(s.get(i-1)))) {
                integerList.add(s.get(i));
                break;
            }
            if (!(s.get(i).equals(s.get(i+1)))) {
                integerList.add(s.get(i));
                continue;
            }
            while (s.get(i).equals(s.get(i+1))) {
                result+=s.get(i+1);
                i++;
            }
            integerList.add(result);
        }

        return integerList;
    }

}