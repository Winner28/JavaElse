public class Divisibility_by13 {

    // https://www.codewars.com/kata/a-rule-of-divisibility-by-13/train/java
    static long []array = new long[] {1, 10, 9, 12, 3, 4};

    public static long thirt(long n) {
        long res = 0;
        String result = String.valueOf(n);



        while (result.length() > 2) {
            
            for (int i = 0, j = result.length() - 1; i < array.length && j >= 0; i++, j--) {
                res += Long.parseLong(String.valueOf(Character.getNumericValue(result.charAt(j)))) * array[i];
            }

            result = String.valueOf(res);
            res = 0;

        }


        return Long.parseLong(result);
    }


}
