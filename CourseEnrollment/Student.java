public class Student implements StudentInterface {
    private String coursetype;//known
    private int duration;
    private CourseInterface onlinecourse;
    private CourseInterface offlinecourse;


    public Student(int duration, String coursetype) {
        this.duration = duration;
        this.coursetype = coursetype;//parameterized constructor
    }

    public Student() {

    }//default constructor


    //getters and setters
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getCoursetype() {
        return coursetype;
    }

    public void setCoursetype(String coursetype) {
        this.coursetype = coursetype;
    }

    public CourseInterface getOnlinecourse() {
        return onlinecourse;
    }

    public void setOnlinecourse(CourseInterface onlinecourse) {
        this.onlinecourse = onlinecourse;
    }

    public CourseInterface getOfflinecourse() {
        return offlinecourse;
    }

    public void setOfflinecourse(CourseInterface offlinecourse) {
        this.offlinecourse = offlinecourse;
    }
}