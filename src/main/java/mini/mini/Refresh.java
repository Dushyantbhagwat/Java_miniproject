package mini.mini;

public class Refresh {

    String name;
    String dob;
    String bloodgroup;

    byte[] report;

    String action;

    public Refresh(String name, String dob, String bloodgroup, byte[] report, String action) {
        this.name = name;
        this.dob = dob;
        this.bloodgroup = bloodgroup;
        this.report = report;
        this.action = action;

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

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
