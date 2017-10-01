
// https://www.codewars.com/kata/55c45be3b2079eccff00010f/train/java
public class Order {
    public static String order(String words) {
        if (words.equals("")) return words;
        String []arr = words.split(" ");
        for (int i = 0; i<arr.length; i++) {
            int index = i;
            int number = search_number(arr[i]);
            for (int j =i; j<arr.length; j++) {
                if (number > search_number(arr[j])) {
                    number = search_number(arr[j]);
                    index = j;
                }
            }

            String temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        return String.join(" ", arr);
    }

    private static int search_number(String str) {
        return Integer.valueOf(str.replaceAll("[^0-9]+", " ").trim());
    }

}
