public abstract class Course implements CourseInterface{
    private int courseid;
    private int fee;
    private StudentInterface student;

    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public StudentInterface getStudent() {
        return student;
    }

    public void setStudent(StudentInterface student) {
        this.student = student;
    }
    public void enroll(){
        this.fee=this.fee*this.student.getDuration();
    }
}
