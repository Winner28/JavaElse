package Solutions;

/**
 * @author vlaDey
 */
public class SortKata {
    public static int[] sortArray(int[] array) {
        sortArr(array,0,array.length-1);
        for (int num: array) System.out.println(num);
        return array;
    }

    private static void sortArr(int []a, int left, int right) {

        int i = left;
        int r =right;
        int pivot = (i+r)/2;

        do {
            while (a[i] < a[pivot] && a[i]%2==0) i++;
            while (a[pivot] < a[r] && a[r]%2==0) r--;

            if (i<=r) {
                int temp = a[i];
                a[i] = a[r];
                a[r] = temp;
                i++;
                r--;
            }

        }while(i<=r);

        if (left<r) sortArr(a,left,r);
        if (i<right) sortArr(a,i,right);
    }

}
