
import java.util.Arrays;

public class SearchSortMiniTool {
    public static void main(String[] args) {
        // Original array of student scores
        int[] scores = {85, 90, 78, 92, 88, 76, 95, 81};

        // Target score to search for
        int target = 92;
        int index = -1;

        // Linear search: find the target score
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                index = i;
                break;
            }
        }

        // Display search result
        if (index != -1) {
            System.out.println("Target score " + target
                    + " was found at index " + index + ".");
        } else {
            System.out.println("Target score " + target
                    + " was not found.");
        }

        // Create a copy so the original array remains unchanged
        int[] sortedScores = Arrays.copyOf(scores, scores.length);

        // Sort the copied array
        Arrays.sort(sortedScores);

        // Print original and sorted arrays
        System.out.println("Original scores: "
                + Arrays.toString(scores));
        System.out.println("Sorted scores: "
                + Arrays.toString(sortedScores));
    }
}
