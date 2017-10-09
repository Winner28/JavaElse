package Solutions;

/**
 * @author vlaDey
 */
// https://www.codewars.com/kata/a-rule-of-divisibility-by-13/train/java


public class Divisibility_by13 {


    static long []array = new long[] {1, 10, 9, 12, 3, 4};

    public static long thirt(long n) {
        long res = 0;
        String value = new StringBuilder(String.valueOf(n)).reverse().toString();


        while (value.length() > 2) {
            int j = 0;

            res = 0;
            for (int i = 0; i < value.length(); i++) {
                if (j == array.length) j = 0;
                res += Character.getNumericValue(value.charAt(i)) * array[j];
                j++;
            }

            value = new StringBuilder(String.valueOf(res)).reverse().toString();
        }

        value = String.valueOf(res);
        return Long.parseLong(value);
    }


}
