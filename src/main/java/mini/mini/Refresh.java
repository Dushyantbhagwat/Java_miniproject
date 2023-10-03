package mini.mini;

import java.net.URL;
import java.time.LocalDate;
public class Refresh {

    String name;
    String dob;
    String bloodgroup;

    byte[] report;

//    URL report;

    public Refresh(String name, String dob, String bloodgroup, byte[] report) {
        this.name = name;
        this.dob = dob;
        this.bloodgroup = bloodgroup;
        this.report = report;

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

    public byte[] getReport() {
        return report;
    }

    public void setReport(byte[] report) {
        this.report = report;
    }
}
