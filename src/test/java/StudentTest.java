
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StudentTest {

    private Student student1;
    private Student student2;
    private Student student3;

    @BeforeEach
    public void setup() {
        student1 = new Student("Jayshree", "C", 5);
        student2 = new Student("Jenny","A", 3);
        student3 = new Student("John", "E", 1);
    }

    @Test
    public void checkNameOfStudent(){
        Assertions.assertEquals("Jayshree", student1.getName());
        Assertions.assertEquals("Jenny", student2.getName());
    }

    @Test
    public void checkGroupOfStudent(){
        Assertions.assertEquals(5, student1.getGroup());
        Assertions.assertEquals(3, student2.getGroup());
    }

    @Test
    public void checkStudentsIsUpgraded(){
        student1.upgrade();
        Assertions.assertEquals("B", student1.getGrade());
        student2.upgrade();
        Assertions.assertEquals("A", student2.getGrade());
        student3.upgrade();
        Assertions.assertEquals("D", student3.getGrade());
    }
    @Test
    public void checkStudentsIsDowngraded(){
        student1.downgrade();
        Assertions.assertEquals("D", student1.getGrade());
        student2.downgrade();
        Assertions.assertEquals("B", student2.getGrade());
        student3.downgrade();
        Assertions.assertEquals("E", student3.getGrade());
    }

    @Test
    public void checkStudentUpgradeAndDowngrade(){
        student1.upgrade();
        Assertions.assertEquals("B", student1.getGrade());

        student1.downgrade();
        Assertions.assertEquals("C", student1.getGrade());
    }
}
