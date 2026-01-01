import java.util.Scanner;
import java.math.BigInteger;
public class Main {
    public static void main(String args[]) {

        StudentInterface s1 = new Student(15, "Online");
        StudentInterface s2 = new Student();


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Student duration");
        BigInteger inputDuration = new BigInteger(sc.nextLine());
        System.out.println("enter the student coursetype");
        String inputcoursetype =sc.nextLine();
        s2.setDuration(inputDuration.intValue());
        s2.setCoursetype(inputcoursetype);

        if (s1.getCoursetype() == "online") {
            CourseInterface oc = new OnlineCourse(101, 1000);
            oc.setStudent(s1);
            oc.enroll();
            s1.setOnlinecourse(oc);
             System.out.println(s1.getOnlinecourse().getFee());
            System.out.println(s1.getOnlinecourse().getCourseid());


        } else {
            OfflineCourse oc1 = new OfflineCourse(101, 1000);
            oc1.setStudent(s2);
            oc1.enroll();
            s1.setOfflinecourse(oc1);
            System.out.println(s1.getOfflinecourse().getFee());
            System.out.println(s1.getOfflinecourse().getCourseid());

        }
        if (s2.getCoursetype() == "offline") {
            OfflineCourse oc1 = new OfflineCourse(101, 1000);
            oc1.setStudent(s2);
            oc1.enroll();
            s2.setOfflinecourse(oc1);
            System.out.println(s2.getOfflinecourse().getFee());
            System.out.println(s2.getOfflinecourse().getCourseid());

        } else {

            OnlineCourse oc = new OnlineCourse(101, 1000);
            oc.setStudent(s2);
            oc.enroll();
            s2.setOnlinecourse(oc);
            System.out.println(s2.getOnlinecourse().getFee());
            System.out.println(s2.getOnlinecourse().getCourseid());

        }
    }
}

