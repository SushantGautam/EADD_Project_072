package IOE_Students.business.domain;

import java.util.List;

public class UserProfile {

    private long userId;
    private String email;
    private String firstName;
    private String lastName;
    private boolean isActive;
    private List<String> roles;
    private String MemberRegistrationID;
    private String MemberGender;
    private java.util.Date MemberBirthDate;
    private String MemberFatherName;
    private String MemberPhone;
    private String MemberRegisterAgent;
    private String MemberNote;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }


    public String getMemberregistrationid() {
        return MemberRegistrationID;
    }

    public void setMemberregistrationid(String MemberRegistrationID) {
        this.MemberRegistrationID = MemberRegistrationID;
    }


    public String getMembergender() {
        return MemberGender;
    }

    public void setMembergender(String MemberGender) {
        this.MemberGender = MemberGender;
    }

    public java.util.Date getMemberbirthdate() {
        return MemberBirthDate;
    }

    public void setMemberbirthdate(java.util.Date MemberBirthDate) {
        this.MemberBirthDate = MemberBirthDate;
    }

    public String getMemberfathername() {
        return MemberFatherName;
    }

    public void setMemberfathername(String MemberFatherName) {
        this.MemberFatherName = MemberFatherName;
    }

    public String getMemberphone() {
        return MemberPhone;
    }

    public void setMemberphone(String MemberPhone) {
        this.MemberPhone = MemberPhone;
    }

    public String getMemberregisteragent() {
        return MemberRegisterAgent;
    }

    public void setMemberregisteragent(String MemberRegisterAgent) {
        this.MemberRegisterAgent = MemberRegisterAgent;
    }

    public String getMembernote() {
        return MemberNote;
    }

    public void setMembernote(String MemberNote) {
        this.MemberNote = MemberNote;
    }
}




