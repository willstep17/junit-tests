import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class CohortTest {
    Cohort cohort;

    @Before
    public void setUp() {
        cohort = new Cohort();
        Student bill = new Student(34234, "Bill");
        bill.addGrade(89);
        bill.addGrade(98);
        cohort.addStudent(bill);
        Student mark = new Student(343232, "Mark");
        mark.addGrade(55);
        mark.addGrade(72);
        cohort.addStudent(mark);
        Student tim = new Student(3432432, "Tim");
        tim.addGrade(88);
        tim.addGrade(97);
        cohort.addStudent(tim);
    }

    @Test
    public void testGetCohortAverage() {
        assertEquals(83.16, cohort.getCohortAverage(), 0.1);
    }

    @Test
    public void testAddStudent() {
        cohort.addStudent(new Student(24324, "Richard"));
        assertEquals("Richard", cohort.getStudents().get(3).getName());
    }

}
