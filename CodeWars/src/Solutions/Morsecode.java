package Solutions;

import java.util.HashMap;
import java.util.Map;
/**
 * @author vlaDey
 */

public class Morsecode {

    private static Map<String, String> morsecode = new HashMap<>();

   public static String morseCode(String code) {
       String []morse = code.split(" ");
       String result ="";
       for (int i =0; i<morse.length; i++) {
           if (morse[i].equals("")) {
               i+=1;
               result += " ";
               continue;
           }
           result+=morsecode.get(morse[i]);
       }

       return result;
   }



   static {
       morsecode.put(".-", "A");
       morsecode.put("-...", "B");
       morsecode.put("-.-.", "C");
       morsecode.put("-..", "D");
       morsecode.put(".", "E");
       morsecode.put("..-.", "F");
       morsecode.put("--.", "G");
       morsecode.put("....", "H");
       morsecode.put("..", "I");
       morsecode.put(".---", "J");
       morsecode.put("-.-", "K");
       morsecode.put(".-..", "L");
       morsecode.put("--", "M");
       morsecode.put("-.", "N");
       morsecode.put("---", "O");
       morsecode.put(".--.", "P");
       morsecode.put("--.-", "Q");
       morsecode.put(".-.", "R");
       morsecode.put("...", "S");
       morsecode.put("-", "T");
       morsecode.put("..-", "U");
       morsecode.put("...-", "V");
       morsecode.put(".--", "W");
       morsecode.put("-..-", "X");
       morsecode.put("-.--", "Y");
       morsecode.put("--..", "Z");
       //-----------------------
       morsecode.put(".----", "1");
       morsecode.put("..---", "2");
       morsecode.put("...--", "3");
       morsecode.put("....-", "4");
       morsecode.put(".....", "5");
       morsecode.put("-....", "6");
       morsecode.put("--...", "7");
       morsecode.put("---..", "8");
       morsecode.put("----.", "9");
       morsecode.put("-----", "0");
       //-----------------------
       morsecode.put(".-.-.-", ".");
       morsecode.put("--..--", ",");
   }
}
