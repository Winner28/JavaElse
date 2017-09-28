public class Kata {
    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length == 0) return 0;
        sortArr(numbers,0,numbers.length-1);
        int result = 0;
        for (int i = 1; i<numbers.length-1; i++) {
            result+=numbers[i];
        }
        return result;
    }

    private static void sortArr(int []a, int left, int right) {

        int i = left;
        int r =right;
        int pivot = (i+r)/2;

        do {
            while (a[i] < a[pivot]) i++;
            while (a[pivot] < a[r]) r--;

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
