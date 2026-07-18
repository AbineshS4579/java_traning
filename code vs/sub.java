import java.util.*;

public class sub {

    public static int lengthOfLongestSubstring(String st) {

        List<Integer> l = new ArrayList<>();

        for (int i = 0; i < st.length(); i++) {

            HashSet<Character> set = new HashSet<>();
            int c = 0;

            for (int j = i; j < st.length(); j++) {

                if (set.contains(st.charAt(j))) {
                    break;
                }

                set.add(st.charAt(j));
                c++;
            }

            l.add(c);
        }

        if (l.isEmpty())
            return 0;

        return Collections.max(l);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String st = s.next();

        System.out.println(lengthOfLongestSubstring(st));
    }
}