public class Patient implements PatientInterface{
    private String symptoms;
    private String doctortype;
    private DoctorInterface generaldoctor;
    private DoctorInterface specialistdoctor;

    public Patient(){

    }


    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }
    public String getDoctortype() {
        return doctortype;
    }

    public void setDoctortype(String doctortype) {
        this.doctortype = doctortype;
    }


    public DoctorInterface getGeneraldoctor() {
        return generaldoctor;
    }

    public void setGeneraldoctor(DoctorInterface generaldoctor) {
        this.generaldoctor = generaldoctor;
    }

    public DoctorInterface getSpecialistdoctor() {
        return specialistdoctor;
    }

    public void setSpecialistdoctor(DoctorInterface specialistdoctor) {
        this.specialistdoctor = specialistdoctor;
    }
}
