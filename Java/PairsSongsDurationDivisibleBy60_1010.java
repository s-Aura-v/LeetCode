public class PairsSongsDurationDivisibleBy60_1010 {
    // BRUTE FORCE SOLUTION
    // WORKS UNTIL THE ARRAY IS VERY LARGE
    public static int numPairsDivisibleBy60(int[] time) {
        int count = 0;
        for (int i = 0; i < time.length; i++) {
            for (int j = i + 1; j < time.length; j++) {
                if (((time[i] + time[j]) % 60) == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    // NON BRUTE FORCE SOLUTION

    public static int optimalNumPairsDivisibleBy60(int[] time) {
        int[] remainder = new int[60]; // Store frequency of remainders
        int count = 0;

        for (int t : time) {
            int rem = t % 60;
            int complement = (rem == 0) ? 0 : 60 - rem;

            count += remainder[complement]; // Count valid pairs

            remainder[rem]++; // Store the current remainder
        }

        return count;
    }




    public static void main(String[] args) {
        int[] time = {30,20,150,100,40};
        System.out.println(numPairsDivisibleBy60(time));
        System.out.println(optimalNumPairsDivisibleBy60(time));
    }
}
