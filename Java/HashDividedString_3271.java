public class HashDividedString_3271 {
    public static String stringHash(String s, int k) {
        String sum = "";
        for (int i = 0; i < s.length(); i+=k) {
            int charSum = 0;
            String partitioned = s.substring(i, i+k);
            // using google, i know the letter a = 97 in ascii
            for (int j = 0; j < partitioned.length(); j++) {
                int charValue = partitioned.charAt(j) - 97;
                charSum += charValue;
            }
            charSum = charSum % 26;
            char x = (char) (charSum + 97);
            sum += x;
        }
        return sum;
    }

    // TESTING
    public static void main(String[] args) {
        System.out.println(stringHash("abcd", 2));
        System.out.println(stringHash("mxz", 3));
    }
}
