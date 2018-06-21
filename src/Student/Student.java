package Student;

/**
 *
 * @author kienle
 */
public class Student {
    private Integer sid;
    private String fname;
    private String lname;
    private String classS;
    private String phone;
    private String email;
    private String address;
    private byte[] pic;
    private int uid;

    public Student() {
    }

    public Student(Integer sid, String fname, String lname, String classS, String phone, String email, String address, byte[] pic, int uid) {
        this.sid = sid;
        this.fname = fname;
        this.lname = lname;
        this.classS = classS;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.pic = pic;
        this.uid = uid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getClassS() {
        return classS;
    }

    public void setClassS(String classS) {
        this.classS = classS;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public byte[] getPic() {
        return pic;
    }

    public void setPic(byte[] pic) {
        this.pic = pic;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
    
    
}
