public class OnlineCourse extends Course implements OnlineCourseInterface{
    public OnlineCourse(int courseid,int fee){
        this.setCourseid(courseid);
        this.setFee(fee);
    }
    public OnlineCourse(){

    }

}
