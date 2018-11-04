import org.junit.Assert;
import org.junit.Test;

import java.text.DecimalFormat;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void totalMark() {
        int[] a1= {50, 60, 65, 60, 65, 70, 55, 66, 60, 73, 65, 45, 68, 54};
        DecimalFormat df = new DecimalFormat("#0.0");
        //int[] a2 = {50, 60, -1, 60, 65, 70, 55, 66, 60, 73, 65, 45, 68, 54};
       // int[] a3 = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,60};
        Student s1 = new Student("11223333",a1);
        //Student s2 = new Student("222222333",a2);
        //Student s3 = new Student("3333333",a3);
        Assert.assertEquals("56.5",df.format(s1.totalMark()));
    }

    @Test
    public void passed() {

    }
}