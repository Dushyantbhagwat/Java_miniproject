package mini.mini;

import java.time.LocalDate;
public class Refresh {

    String name;
    String dob;
    String bloodgroup;

    public Refresh(String name, String dob, String bloodgroup) {
        this.name = name;
        this.dob = dob;
        this.bloodgroup = bloodgroup;
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

}
