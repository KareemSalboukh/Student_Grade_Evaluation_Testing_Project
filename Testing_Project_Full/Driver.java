
public class Driver {

    public static void main(String[] args) {
        GradeCalculator gc = new GradeCalculator();

        int[] epScores = {95, 85, 75, 65, 40, -5, 150};

        System.out.println("===== EP Test Cases =====");
        for (int s : epScores) {
            System.out.println("Score: " + s + " -> " + gc.calculateLetterGrade(s));
        }

        int[] bvaScores = {-1, 0, 59, 60, 69, 70, 79, 80, 89, 90, 100, 101};

        System.out.println("\n===== BVA Test Cases =====");
        for (int s : bvaScores) {
            System.out.println("Score: " + s + " -> " + gc.calculateLetterGrade(s));
        }
    }
}
