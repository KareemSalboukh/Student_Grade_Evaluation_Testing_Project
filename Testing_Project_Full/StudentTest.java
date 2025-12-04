
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;

public class StudentTest {

    @Test
    public void constructorWithValidDataInitializesFieldsAndCourses() {
        Student s = new Student("1234", "Kareem");
        assertEquals("1234", s.getId());
        assertEquals("Kareem", s.getName());
        assertNotNull(s.getCourses());
        assertTrue(s.getCourses().isEmpty());
    }

    @Test
    public void constructorWithNullIdUsesDefault() {
        Student s = new Student(null, "Rayan");
        assertEquals("0000", s.getId());
        assertEquals("Rayan", s.getName());
    }

    @Test
    public void constructorWithEmptyIdUsesDefault() {
        Student s = new Student("", "Rayan");
        assertEquals("0000", s.getId());
    }

    @Test
    public void constructorWithNullNameUsesDefault() {
        Student s = new Student("2020", null);
        assertEquals("2020", s.getId());
        assertEquals("Unknown", s.getName());
    }

    @Test
    public void constructorWithEmptyNameUsesDefault() {
        Student s = new Student("2020", "");
        assertEquals("Unknown", s.getName());
    }

    @Test
    public void enrollCourseAddsNonNullCourse() {
        Student s = new Student("1001", "Khalid");
        Course c = new Course("Math", 3, "A");
        s.enrollCourse(c);
        assertEquals(1, s.getCourses().size());
    }
}
