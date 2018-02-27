package solutions.theta.testapp.Models;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by SALAHUDIN` on 2/27/2018.
 */

public class User implements Serializable {
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public String getGendar() {
        return Gendar;
    }

    public void setGendar(String gendar) {
        Gendar = gendar;
    }
public User(){

}
public  User(String Name,String Email){
    this.Name=Name;
    this.Email=Email;
}
    String Name;
    String Email;
    String Mobile;
    Date DOB;
    int Status;
    String Gendar;
}
