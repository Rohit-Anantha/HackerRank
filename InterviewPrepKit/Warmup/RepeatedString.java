package InterviewPrepKit.Warmup;

public class RepeatedString {
    public static long repeatedString(String s, long n) {
        // Write your code here
        long repetitionsOfAInS = 0;

        for (char c : s.toCharArray()) {
            if (c == 'a') {
                repetitionsOfAInS++;
            }
        }

        repetitionsOfAInS *= n / s.length();

        long buffer = n % s.length();
        long i = 0;
        for (char c : s.toCharArray()) {
            if (i < buffer) {
                if (c == 'a') {
                    repetitionsOfAInS++;
                }
            }
            else{
                break;
            }
            i++;
        }

        return repetitionsOfAInS;
    }
}
