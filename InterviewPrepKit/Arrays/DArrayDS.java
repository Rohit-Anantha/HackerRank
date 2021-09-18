package InterviewPrepKit.Arrays;

import java.util.List;

public class DArrayDS {
    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        int maxHourglassSum = Integer.MIN_VALUE;

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                int current = checkHourglass(arr, i, j);
                if (current > maxHourglassSum) {
                    maxHourglassSum = current;
                }
            }
        }

        return maxHourglassSum;

    }

    private static int checkHourglass(List<List<Integer>> arr, int row, int col) {

        int sum = 0;

        sum += arr.get(row - 1).get(col - 1); // up left
        sum += arr.get(row - 1).get(col); // up middle
        sum += arr.get(row - 1).get(col + 1); // up right
        sum += arr.get(row).get(col); // current cell
        sum += arr.get(row + 1).get(col - 1); // lower left
        sum += arr.get(row + 1).get(col); // lower middle
        sum += arr.get(row + 1).get(col + 1); // lower right

        return sum;

    }
}
