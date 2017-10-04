/**
 * @author vlaDey
 */
public class DescendingOrder {

    public static int sortDesc(final int num) {
        String value = String.valueOf(num);
        StringBuilder str = new StringBuilder(value).reverse();
        value = str.toString();
        if (value.length() == 2) return Integer.parseInt(value);
        if (isSorted(value)) {
            return Integer.parseInt(value);
        }

        return sort(value);
    }

    private static boolean isSorted(String consv) {
        for (int i = 0; i<consv.length()-1; i++) {
            if (!(Character.getNumericValue(consv.charAt(i)) > Character.getNumericValue(consv.charAt(i+1))))
                return false;
        }
        return true;
    }


    private static int sort(String value) {
        int []num = new int[value.length()];

        for (int i =0; i<value.length(); i++) {
            num[i] = value.charAt(i) - '0';
        }

        for (int i =0; i<num.length; i++) {
            int index = i;
            for (int j = i; j<num.length; j++) {
                if (num[index] < num[j]) {
                    index = j;
                }
            }
            int temp = num[index];
            num[index] = num[i];
            num[i] = temp;
        }

        StringBuilder strnum = new StringBuilder();

        for (int n:num) {
            strnum.append(n);
        }

        return Integer.parseInt(strnum.toString());
    }



}
