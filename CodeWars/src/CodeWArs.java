import Solutions.Divisibility_by13;
import Solutions.Groups;

public interface CodeWArs {

    public static void main(String[] args) {
        System.out.println(Groups.groupCheck("({[[)]})"));
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
