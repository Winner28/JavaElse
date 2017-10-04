import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface CodeWArs {

    public static void main(String[] args) {

        print(Divisibility_by13.thirt(987654321));
    }



    public static <S, T extends Iterable<S>> void print(T list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }

    public static void print(Object string) {
        System.out.println(string);
    }
}
