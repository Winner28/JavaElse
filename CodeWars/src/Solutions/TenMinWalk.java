package Solutions;

/**
 * @author vlaDey
 */

public class TenMinWalk {


    public static boolean isValid(char[] walk) {

        if (walk.length < 10 || walk.length > 10) return false;

        int w_count=0, n_count=0, e_count=0, s_count = 0;

        for (char dir : walk) {
            if (dir == 'w') w_count++;
            else if (dir == 'n') n_count++;
            else if (dir == 'e') e_count++;
            else s_count++;
        }

        return !(w_count!=e_count || s_count!=n_count);
    }
}
