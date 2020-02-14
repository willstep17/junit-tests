import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class StudentTest {
    Student student;

    @Before
    public void setUp() {
        student = new Student(8856463, "Carl");
    }

    @Test
    public void testStudentHasParams() {
        assertNotNull(student.getId());
        assertNotNull(student.getName());
    }

}
