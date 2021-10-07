package InterviewPrepKit.Warmup;

import java.util.List;

public class JumpingOnTheClouds {
    public static int jumpingOnClouds(List<Integer> c) {

        int counter = 0;
        for (int i = 0; i < c.size() - 1; i++) {
            if(i < c.size() - 2 && c.get(i + 2) != 1)
            {
                counter++;
                i++;
            }else if(c.get(i + 1) != 1)
            {
                counter++;
            }
        }
        return counter;
    }

    public static int jump(List<Integer> c, int index) {
        if (index > c.size() - 1) {
            return Integer.MAX_VALUE;
        } else if (c.get(index) == 1) {
            return Integer.MAX_VALUE;
        } else if (index == c.size()) {
            return 1;
        } else {
            int pathOne = jump(c, index + 1);
            int pathTwo = jump(c, index + 2);
            return pathOne > pathTwo ? pathOne : pathTwo;
        }
    }
}