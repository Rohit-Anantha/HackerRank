package InterviewPrepKit.Arrays;

import java.util.*;

public class LeftRotation {
    public static void main(String[] args) {

    }

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        // to shift by left, move each element a to a - 1.
        // at lowest position, cycle wrap around.

        ArrayList<Integer> list = new ArrayList<>();
        int index = d;
        for (int i = 0; i < a.size(); i++) {
            list.add(a.get(index));
            index = (index + 1) % a.size();
        }

        return list;
        // Write your code here

    }

}