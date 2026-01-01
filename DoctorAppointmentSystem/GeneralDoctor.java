public class GeneralDoctor extends Doctor implements GeneralDoctorInterface {

    public GeneralDoctor(String appointmentid, int consultationfee) {
        this.setAppointmentid(appointmentid);
        this.setConsultationfee(consultationfee);
    }
}
