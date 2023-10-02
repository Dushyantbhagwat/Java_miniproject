package mini.mini;

public class AdminPatient  {

    String name;
    String dob;

    String bloodgroup;
    String phone_number;

    public AdminPatient(String name, String dob, String bloodgroup, String phone_number) {
//        super();
        this.name = name;
        this.dob = dob;
        this.bloodgroup = bloodgroup;
        this.phone_number = phone_number;
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
}
