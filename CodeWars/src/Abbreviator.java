public class Abbreviator {

    public static String abbreviate(String string) {
        String str = String.valueOf(string.length()-2);
        String result = string.charAt(0) +str+ string.charAt(string.length()-1);
      return result;
    }

}