import java.util.*;

// Problem 6: Longest Substring Without Repeating Characters

class ProblemSix {
    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> charIndex = new HashMap<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            if (charIndex.containsKey(currentChar)) {
                left = Math.max(left, charIndex.get(currentChar) + 1);
            }

            charIndex.put(currentChar, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        int result = lengthOfLongestSubstring(s);
        System.out.println("Output: " + result);
        sc.close();
    }
}