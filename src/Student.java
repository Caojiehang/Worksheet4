import java.text.DecimalFormat;
import java.util.Arrays;

/**
 * @Author: Jiehang CAO
 * @Description:
 * @Date: 5:04 PM 2018/10/27
 */
public class Student {
    private String registrationNumber;

    private int[] marks;


    public Student(String registrationNumber, int[] marks) {
        this.registrationNumber = registrationNumber;
        this.marks = marks;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public void setAssignmentMark(int assignmentNumber, int mark) {
        getMarks()[assignmentNumber-1] = mark;
    }

    public double totalMark() {
        int[] a = marks;
        int k = 0; // the k is to count the number of (-1).
        double total = 0;
        double percent = 0;
        double sum = 0;

        int i = 0;
        double x= 1.00;
        while (i<a.length) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                    percent = 0.02;
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    percent = 0.01;
                    break;
                case 8:
                case 9:
                    percent = 0.02;
                    break;
                case 10:
                    percent = 0.01;
                    break;
                case 11:
                    percent = 0.03;
                    break;
                case 12:
                    percent = 0.1;
                    break;
                case 13:
                    percent = 0.7;
                    break;
            }
            total = (total + a[i] * percent);
            if (a[i] == -1) {
                setAssignmentMark(i+1,0);
                x = x - percent;
            }
            if(a[13] == -1) {
                return -1;
            }
            i++;
        }
        /**
         * output value with the format '0.0'
         */
        DecimalFormat df = new DecimalFormat("#0.0");
        sum = Double.valueOf(df.format((total/x)));
//         sum = total/x;
        return sum;
    }



    public boolean passed(){
        boolean ispassed =false;
        if (totalMark() >= 50) {
            ispassed = true;
        } else if(totalMark() == -1) {
            throw  new IllegalArgumentException();
        }
        return ispassed;
    }

    @Override
    public String toString() {
        return "Student{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }




}
