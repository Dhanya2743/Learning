public interface DoctorInterface {
    public String getAppointmentid();
    public void setAppointmentid(String appointmentid);
    public int getConsultationfee();
    public void setConsultationfee(int consultationfee);
    public void bookAppointment();
    public void setPatient(PatientInterface patient);
    public PatientInterface getPatient();



}



