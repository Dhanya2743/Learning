public interface CourseInterface {

    public int getCourseid();

    public void setCourseid(int courseid);
    public int getFee();
    public void setFee(int fee);
    public StudentInterface getStudent();
    public void setStudent(StudentInterface student);
    public void enroll();

}