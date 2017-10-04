
/**
 * @author vlaDey
 */
public class EqualsKata {

    public static double findUniq(double arr[]) {

        sortArr(arr, 0, arr.length-1);
        if (arr[0]!=arr[1]) return arr[0];
        return arr[arr.length-1];

    }


    private static void sortArr(double []a, int left, int right) {

        int i = left;
        int r =right;
        int pivot = (i+r)/2;

        do {
            while (a[i] < a[pivot]) i++;
            while (a[pivot] < a[r]) r--;

            if (i<=r) {
                double temp = a[i];
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
