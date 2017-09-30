import java.util.ArrayList;
import java.util.List;


//https://www.codewars.com/kata/take-a-number-and-sum-its-digits-raised-to-the-consecutive-powers-and-dot-dot-dot-eureka/train/java


class SumDigPower {

    public static List<Long> sumDigPow(long a, long b) {
        List<Long> longList = new ArrayList<>();
            for (long i = a; i < b; i++) {
                if (i <10)  {
                    longList.add(i);
                    continue;
                }
                if (checkNumber(i)) {
                    longList.add(i);
                }
        }

        return longList;
    }

    private static boolean checkNumber(long number) {

        int result = 0;
        for (int i =0; i<String.valueOf(number).length(); i++) {
            result += Math.pow(Character.getNumericValue(String.valueOf(number).charAt(i)), i+1);
        }

        return result==number;
    }

}