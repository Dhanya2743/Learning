public class SpecialistDoctor extends Doctor implements SpecialistDoctorInterface {


    public SpecialistDoctor(String appointmentid, int consultationfee) {
        this.setAppointmentid(appointmentid);
        this.setConsultationfee(consultationfee);
    }
    public SpecialistDoctor(){

    }
}
