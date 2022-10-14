public class SummativeSums {

    /* method that takes in an array of ints,
       adds them together, and returns result.
     */
    static int sumArray(int [] arr) {
        // initialize sum and i
        int sum = 0;
        int i;

        // iterate through elements of array and add together
        // return the sum
        for (i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;

    }

    public static void main(String[] args) {
        // adding arrays
        int arrOne[] = {1, 90, -33, -55, 67, -16, 28, -55, 15};
        int arrTwo[] = {999, -60, -77, 14, 160, 301};
        int arrThree[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99};

        // print sums of arrays
        System.out.println("#1 Array Sum: " + sumArray(arrOne));
        System.out.println("#2 Array Sum: " + sumArray(arrTwo));
        System.out.println("#3 Array Sum: " + sumArray(arrThree));
    }
}
