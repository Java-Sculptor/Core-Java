package Strings;

public class MinOccur {
    public static void main(String[] args) {
		
        String s = "abbccc";
        char c = Minimum(s);
        System.out.println("The minimum occurring character is: " + c);
    }

    public static char Minimum(String s) {
    
        int[] frequency = new int[26]; // Assuming only lowercase letters
        for (char ch : s.toCharArray()) {
            frequency[ch - 'a']++;
        }

        char min = 'z'; // Initialize with a character that is guaranteed to be greater than any lowercase letter
        for (char ch : s.toCharArray()) {
            if (frequency[ch - 'a'] > 0 && ch < min) {
                min = ch;
            }
        }

        return min;
    }
}
