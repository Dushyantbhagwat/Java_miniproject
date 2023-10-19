package mini.mini;

public class AdminPatientHistory {


    private int patient_id;

    String name;
    String dob;

    String bloodgroup;
    String phone_number;

    String email_id;

    String address;

    byte[] report;

    String action;
    String request_date;

    public AdminPatientHistory(int patient_id,String name, String dob, String bloodgroup, String phone_number,String email_id, String address, byte[] report, String action, String request_date) {
        this.name = name;
        this.dob = dob;
        this.bloodgroup = bloodgroup;
        this.phone_number = phone_number;
        this.email_id = email_id;
        this.address = address;
        this.report = report;
        this.patient_id=patient_id;
        this.action=action;
        this.request_date=request_date;
    }




    public int getId() {
        return patient_id;
    }

    public void setId(int id) {
        this.patient_id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public byte[] getReport() {
        return report;
    }

    public void setReport(byte[] report) {
        this.report = report;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getRequest_date() {
        return request_date;
    }

    public void setRequest_date(String request_date) {
        this.request_date = request_date;
    }

}
