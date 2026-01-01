public interface PatientInterface {
    public String getSymptoms();
    public void setSymptoms(String symptoms);
    public String getDoctortype();
    public void setDoctortype(String doctortype);
    public DoctorInterface getGeneraldoctor();
    public void setGeneraldoctor(DoctorInterface generaldoctor);
    public DoctorInterface getSpecialistdoctor();
    public void setSpecialistdoctor(DoctorInterface specialistdoctor);
}
