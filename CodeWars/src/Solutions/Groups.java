package Solutions;


import java.util.HashMap;
import java.util.HashSet;

@AboutAnno(
        author = "vlaDey",
        kata = "https://www.codewars.com/kata/54b80308488cb6cd31000161/train/java",
        status = "solved (but on Kata!)"

)



public class Groups {
    private static HashMap<String,String> invertMap = new HashMap<>();

    public static boolean groupCheck(String s){
        if (s.length()%2!=0) return false;
        char []symb = s.toCharArray();
        for (int i =0, j = symb.length -1 ; i< symb.length/2; i++, --j) {
            System.out.println(symb[i] + " and " + symb[j]);
            if (!(String.valueOf(symb[i]).equals(invertMap.get(String.valueOf(symb[j]))))) return false;
        }
        return true;
    }


    static {
        invertMap.put(")", "(");
        invertMap.put("(", ")");


        invertMap.put("]", "[");
        invertMap.put("[", "]");


        invertMap.put("}", "{");
        invertMap.put("{", "}");
    }


}


