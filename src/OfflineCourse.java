public class OfflineCourse extends Course implements OfflineCourseInterface {
    public OfflineCourse(int courseid,int fee){
        this.setCourseid(courseid);
        this.setFee(fee);
    }
    public OfflineCourse(){

    }
}