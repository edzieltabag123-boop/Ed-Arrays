
public class ClassStatisticsCalculator {
    public static void main(String[] args) {
        // Array of 8 student scores
        int[] scores = {85, 90, 78, 92, 88, 76, 95, 81};

        int sum = 0;
        int highest = scores[0];
        int lowest = scores[0];

        // Calculate sum, highest, and lowest using a loop
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];

            if (scores[i] > highest) {
                highest = scores[i];
            }

            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }

        // Calculate average
        double average = (double) sum / scores.length;

        // Display all four statistics
        System.out.println("Class Statistics");
        System.out.println("Sum: " + sum);
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
    }
}
