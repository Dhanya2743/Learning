public abstract class Doctor implements DoctorInterface{
    private String appointmentid;
    private int consultationfee;
    private PatientInterface patient;

    public String getAppointmentid() {
        return appointmentid;
    }

    public void setAppointmentid(String appointmentid) {
        this.appointmentid = appointmentid;
    }

    public int getConsultationfee() {
        return consultationfee;
    }

    public void setConsultationfee(int consultationfee) {
        this.consultationfee = consultationfee;
    }
    public void bookAppointment(){
        System.out.println("Appointment booked:");
        System.out.println(patient.getSymptoms());
        System.out.println("Consultation fee");
        System.out.println(consultationfee);


    }

    public void setPatient(PatientInterface patient) {
        this.patient = patient;
    }
    public PatientInterface getPatient() {
        return patient;
    }

}
