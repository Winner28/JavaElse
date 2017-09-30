import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodeWArs {

    public static void main(String[] args) {

    }



    public static <S, T extends Iterable<S>> void print(T list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }

    public static void print(String string) {
        System.out.println(string);
    }
}
