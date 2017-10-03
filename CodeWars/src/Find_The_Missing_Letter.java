public class Find_The_Missing_Letter {


    //https://www.codewars.com/kata/5839edaa6754d6fec10000a2/train/java

    private static char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public static char findMissingLetter(char[] array) {

        boolean isUpper = false;
        if (array[0] == Character.toUpperCase(array[0])) {
            isUpper = true;
            for (int i =0; i<array.length; i++) {
                array[i] = Character.toLowerCase(array[i]);
            }

        }


        int index =0, start_A = 0, end_A = 0;

        //Find start and end index in alphabet

        for (int i =0; i<alphabet.length; i++) {
            if (alphabet[i] == array[0]) {
                start_A = i;
                continue;
            }
            if (alphabet[i] == array[array.length-1]) {
                end_A = i;
                break;
            }
        }

        // If the element in array is not equal to alphabet element, that means we found our missing letter!
        //remember the index
        for (int i = 0, j = start_A; i <array.length && j < end_A; i++, j++) {
            if (array[i] != alphabet[j]) {
                index = j;
                break;
            }
        }

        if (isUpper) return Character.toUpperCase(alphabet[index]);


        return alphabet[index];
    }


}
