package Solutions;


@AboutAnno(
        author = "vlaDey",
        kata =  "https://www.codewars.com/kata/557e8a141ca1f4caa70000a6/train/java",
        status = "unsolved"
)

public class TriangleNumbers {
    public static Boolean isTriangleNumber(long number) {
        if (number == 0 || number == 1) return true;
        System.out.println(number%9);
        return false;
    }
}
