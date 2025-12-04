
public class Course {

    private String courseName;
    private int creditHours;
    private String letterGrade;

    public Course(String courseName, int creditHours, String letterGrade) {

        if (courseName == null || courseName.trim().isEmpty())
            this.courseName = "Unknown";
        else
            this.courseName = courseName;

        if (creditHours < 1 || creditHours > 6)
            this.creditHours = 3;
        else
            this.creditHours = creditHours;

        if (!letterGrade.matches("[ABCDF]"))
            this.letterGrade = "F";
        else
            this.letterGrade = letterGrade;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public String getLetterGrade() {
        return letterGrade;
    }

    public double getGradePoint() {
        switch (letterGrade) {
            case "A": return 4.0;
            case "B": return 3.0;
            case "C": return 2.0;
            case "D": return 1.0;
            default:  return 0.0;
        }
    }
}
