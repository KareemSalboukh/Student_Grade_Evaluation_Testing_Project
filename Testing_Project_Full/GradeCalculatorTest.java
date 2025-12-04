
import static org.junit.Assert.*;
import org.junit.Test;

public class GradeCalculatorTest {

    private final GradeCalculator gc = new GradeCalculator();

    @Test
    public void testValidGradeRanges() {
        assertEquals("A", gc.calculateLetterGrade(95));
        assertEquals("B", gc.calculateLetterGrade(85));
        assertEquals("C", gc.calculateLetterGrade(75));
        assertEquals("D", gc.calculateLetterGrade(65));
        assertEquals("F", gc.calculateLetterGrade(40));
    }

    @Test
    public void testBoundaryValues() {
        assertEquals("F", gc.calculateLetterGrade(59));
        assertEquals("D", gc.calculateLetterGrade(60));
        assertEquals("C", gc.calculateLetterGrade(70));
        assertEquals("B", gc.calculateLetterGrade(80));
        assertEquals("A", gc.calculateLetterGrade(90));
    }

    @Test
    public void testInvalidScores() {
        assertEquals("Invalid", gc.calculateLetterGrade(-10));
        assertEquals("Invalid", gc.calculateLetterGrade(150));
    }
}
