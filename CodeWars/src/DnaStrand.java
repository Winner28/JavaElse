
/**
 * @author vlaDey
 */

public class DnaStrand {

    public static String makeComplement(String dna) {
        char [] ch = dna.toCharArray();
        for (int i =0; i<ch.length; i++) {
            switch (ch[i]) {
                case 'T':
                    ch[i] = 'A';
                    break;
                case 'A':
                    ch[i] = 'T';
                    break;
                case 'G':
                    ch[i] = 'C';
                    break;
                case 'C':
                    ch[i] = 'G';
                    break;
            }
        }

        return new String(ch);
    }
}
