
import static org.junit.Assert.*;
import org.junit.Test;

public class CourseTest {

    @Test
    public void constructorWithValidValuesStoresThem() {
        Course c = new Course("Math", 3, "A");
        assertEquals("Math", c.getCourseName());
        assertEquals(3, c.getCreditHours());
        assertEquals("A", c.getLetterGrade());
    }

    @Test
    public void constructorWithNullCourseNameUsesDefaultUnknown() {
        Course c = new Course(null, 3, "B");
        assertEquals("Unknown", c.getCourseName());
    }

    @Test
    public void constructorWithInvalidCreditHoursUsesDefault3() {
        Course c = new Course("Math", 10, "A");
        assertEquals(3, c.getCreditHours());
    }

    @Test
    public void getGradePointReturnsCorrectValue() {
        assertEquals(4.0, new Course("Math", 3, "A").getGradePoint(), 0.001);
        assertEquals(3.0, new Course("Math", 3, "B").getGradePoint(), 0.001);
        assertEquals(2.0, new Course("Math", 3, "C").getGradePoint(), 0.001);
        assertEquals(1.0, new Course("Math", 3, "D").getGradePoint(), 0.001);
        assertEquals(0.0, new Course("Math", 3, "F").getGradePoint(), 0.001);
    }
}
