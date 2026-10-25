
public class Main {

    // Student class
    static class Student {
        String name;
        int[] quizzes;
        double average;

        public Student(String name, int[] quizzes) {
            this.name = name;
            this.quizzes = quizzes;
            this.average = calculateAverage();
        }

        public double calculateAverage() {
            int total = 0;

            for (int i = 0; i < quizzes.length; i++) {
                total += quizzes[i];
            }

            return (double) total / quizzes.length;
        }
    }

    // Linear search to find a student's rank
    public static int findStudentRank(Student[] students, String name) {
        int index = -1;

        for (int i = 0; i < students.length; i++) {
            if (students[i].name.equalsIgnoreCase(name)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return -1;
        }

        int rank = 1;

        for (int i = 0; i < students.length; i++) {
            if (students[i].average > students[index].average) {
                rank++;
            }
        }

        return rank;
    }

    // Custom Bubble Sort (no Arrays.sort())
    public static void sortStudents(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {

                boolean swap = false;

                if (students[j].average < students[j + 1].average) {
                    swap = true;
                } else if (
                    students[j].average == students[j + 1].average &&
                    students[j].name.compareToIgnoreCase(
                        students[j + 1].name
                    ) > 0
                ) {
                    swap = true;
                }

                if (swap) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    // Print formatted leaderboard
    public static void printLeaderboard(Student[] students) {
        sortStudents(students);

        System.out.println("========================================");
        System.out.println("          CLASS LEADERBOARD");
        System.out.println("========================================");
        System.out.printf("%-8s %-15s %-10s%n",
                          "Rank", "Name", "Average");
        System.out.println("----------------------------------------");

        int rank = 0;
        double previousAverage = -1;

        for (int i = 0; i < students.length; i++) {
            if (i == 0 || students[i].average != previousAverage) {
                rank = i + 1;
            }

            System.out.printf("%-8d %-15s %-10.2f%n",
                              rank,
                              students[i].name,
                              students[i].average);

            previousAverage = students[i].average;
        }

        System.out.println("========================================");
    }

    // Main method: program execution starts here
    public static void main(String[] args) {

        Student[] students = {
            new Student("Edziel", new int[]{95, 92, 98, 90}),
            new Student("Joseph", new int[]{85, 88, 84, 87}),
            new Student("Joyce", new int[]{95, 92, 98, 90}),
            new Student("Zhaldy", new int[]{78, 82, 80, 85}),
            new Student("Leo", new int[]{89, 91, 87, 93})
        };

        // Display leaderboard
        printLeaderboard(students);

        // Search for a student
        String searchName = "Edziel";
        int rank = findStudentRank(students, searchName);

        if (rank != -1) {
            System.out.println(
                searchName + " is ranked #" + rank
            );
        } else {
            System.out.println("Student not found.");
        }
    }
}
