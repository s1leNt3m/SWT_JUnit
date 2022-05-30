package StringFunction;

public class isPalindrome {
    public static boolean isPalindrome(String str){
        int strLength = str.length();
        String reverseStr = "";

        for (int i = (strLength - 1); i >=0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            return true;
        }
        else {
            return false;
        }
    }
}
