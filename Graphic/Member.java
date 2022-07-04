
package xatrock;

public class Member {
     String primaryId;
     String firstName ;
     String lastName ;
     long phoneNumber ;
     int status ;
     String userName ;
     int password ;
     String email ;

    public String getPrimaryId() {
        return primaryId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public int getStatus() {
        return status;
    }

    public String getUserName() {
        return userName;
    }

    public int getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setPrimaryId(String primaryId) {
        this.primaryId = primaryId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }
     
    
}
