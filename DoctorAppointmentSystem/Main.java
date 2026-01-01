import java.util.Scanner;
public class Main {

    public static void main(String args[]){

        PatientInterface p1=new Patient();

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the symptoms:");
        String inputSymptoms=sc.nextLine();
        p1.setSymptoms(inputSymptoms);
        System.out.println("enter the doctortype:");
        String inputDoctortype=sc.nextLine();
        p1.setDoctortype(inputDoctortype);

        PatientInterface p2=new Patient();
        System.out.println("enter the symptoms:");
        String inputSymptoms1=sc.nextLine();
        p2.setSymptoms(inputSymptoms1);
        System.out.println("enter the doctortype:");
        String inputDoctortype1=sc.nextLine();
        p2.setDoctortype(inputDoctortype1);


        if(p1.getDoctortype()=="General"){
            DoctorInterface gd=new GeneralDoctor("ID023",100);
            p1.setGeneraldoctor(gd);
            gd.setPatient(p1);
            gd.bookAppointment();
            System.out.println("Appointmentid");
            System.out.println(p1.getGeneraldoctor().getAppointmentid());
            System.out.println("Fee");
            System.out.println(p1.getGeneraldoctor().getConsultationfee());
        }
        else{
            DoctorInterface sd=new SpecialistDoctor("ID024",500);
            p1.setSpecialistdoctor(sd);
            sd.setPatient(p1);
            sd.bookAppointment();
            System.out.println("Appointmentid");
            System.out.println(p1.getSpecialistdoctor().getAppointmentid());
            System.out.println("Fee");
            System.out.println(p1.getSpecialistdoctor().getConsultationfee());
        }
        if(p2.getDoctortype()=="SpecialistDoctor"){
            DoctorInterface sd=new SpecialistDoctor("ID025",500);
            p2.setSpecialistdoctor(sd);
            sd.setPatient(p2);
            sd.bookAppointment();
            System.out.println("Appointmentid");
            System.out.println(p2.getSpecialistdoctor().getAppointmentid());
            System.out.println("Fee");
            System.out.println(p2.getSpecialistdoctor().getConsultationfee());
        }
        else{
            DoctorInterface gd=new GeneralDoctor("ID026",100);
            p2.setGeneraldoctor(gd);
            gd.setPatient(p2);
            gd.bookAppointment();
            System.out.println("Appointmentid");
            System.out.println(p2.getGeneraldoctor().getAppointmentid());
            System.out.println("Fee");
            System.out.println(p2.getGeneraldoctor().getConsultationfee());
        }








    }

}
