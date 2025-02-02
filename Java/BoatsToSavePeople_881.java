import java.util.Arrays;

public class BoatsToSavePeople_881 {
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        int boatCount = 0;

        while (left <= right) {
            int sum = people[left] + people[right];
            if (sum <= limit) {
                left++;
            }
            boatCount++;
            right--;
        }
        return boatCount;
    }

    // Failed Attempt
    // I didn't consider that if the heaviest and the lighest people fit, then that's the best case scenario.
    public static int failed_NumRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        int boatCount = 0;

        while (left <= right) {
            if (right >= limit) {
                boatCount++;
                right--;
                continue;
            }
            int sum = people[left] + people[right];

            if (sum > limit) {
                right--;
            } else if (sum < limit) {
                left++;
            } else {
                boatCount++;
                left++;
                right--;
                continue;
            }
        }
        return boatCount;
    }

    public static void main(String[] args) {
        System.out.println(numRescueBoats(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 3));
    }
}
