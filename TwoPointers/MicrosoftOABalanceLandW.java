package TwoPointers;

public class MicrosoftOABalanceLandW {
    public static int countOperation(String a, String b, int n) {
        int cnt = 0;
        int r1 = 0, r2 = 0, w1 = 0, w2 = 0;
        for (int i = 0; i < n; i++) {
            char s1 = a.charAt(i);
            char s2 = b.charAt(i);
            if (s1 == s2 && s1 != '?')
                return -1;
            if (s1 == 'r' && s2 == '?') {
                cnt++;
                r1++;
                w2++;
            } else if (s1 == 'w' && s2 == '?') {
                cnt++;
                r2++;
                w1++;
            } else {
                if (s1 == 'w') w1++;
                else if (s1 == 'r') r1++;
                if (s2 == 'r') r2++;
                else if (s2 == 'w') w2++;
            }

        }

        if (r1 != w2 || r2 != w1) return -1;
        if (r1 == w1 && r2 == w2) return 0;

        cnt += r1;
        cnt += w2;
        return cnt;
    }

    public static void main(String[] args) {
        String a = "?rw?wr";
        String b = "?wr?rw";
        int len = a.length();

        System.out.println(countOperation(a, b, len));

    }
}
