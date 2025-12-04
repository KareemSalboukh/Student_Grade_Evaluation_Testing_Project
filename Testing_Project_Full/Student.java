
import java.util.ArrayList;
import java.util.List;

public class Student {

    private String id;
    private String name;
    private List<Course> courses;

    public Student(String id, String name) {
        if (id == null || id.trim().isEmpty()) {
            this.id = "0000";
        } else {
            this.id = id;
        }

        if (name == null || name.trim().isEmpty()) {
            this.name = "Unknown";
        } else {
            this.name = name;
        }

        this.courses = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void enrollCourse(Course course) {
        if (course != null)
            courses.add(course);
    }

    public double calculateGPA() {
        if (courses.isEmpty()) return 0.0;

        double totalPoints = 0.0;
        int totalHours = 0;

        for (Course c : courses) {
            totalPoints += c.getGradePoint() * c.getCreditHours();
            totalHours += c.getCreditHours();
        }

        return totalPoints / totalHours;
    }
}
