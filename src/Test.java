
/**
* @Author: Jiehang CAO
* @Description:
* @Date: 9:27 PM 2018/10/27
*/
public class Test {

    public static void main(String[] args) {
        int[] a1= {50, 60, 65, 60, 65, 70, 55, 66, 60, 73, 65, 45, 68, 54};
        int[] a2 = {50, 60, -1, 60, 65, 70, 55, 66, 60, 73, 65, 45, 68, 54};
        int[] a3 = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,60};
        Student s1 = new Student("11223333",a1);
        Student s2 = new Student("222222333",a2);
        Student s3 = new Student("3333333",a3);
        System.out.println(s1.totalMark());
        System.out.println(s1.toString());
        System.out.println(s1.passed());
        System.out.println(s2.totalMark());
        System.out.println(s2.toString());
        System.out.println(s2.passed());
        System.out.println(s3.totalMark());
        System.out.println(s3.toString());
        System.out.println(s3.passed());



    }
}
//3.4+2.56+2.66+0.65+1.35+0.68+37.8