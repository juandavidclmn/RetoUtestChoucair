package co.com.choucair.certification.proyectobase.model;

public class EnterUserData {
    private String strName, strLastName, strEmail, strPassword, strConfirmPassword, strConfirmation;

    public String getStrPassword() {
        return strPassword;
    }

    public String getStrConfirmation() {
        return strConfirmation;
    }

    public void setStrConfirmation(String strConfirmation) {
        this.strConfirmation = strConfirmation;
    }

    public void setStrPassword(String strPassword) {
        this.strPassword = strPassword;
    }

    public String getStrConfirmPassword() {
        return strConfirmPassword;
    }

    public void setStrConfirmPassword(String strConfirmPassword) {
        this.strConfirmPassword = strConfirmPassword;
    }

    public String getStrName() {
        return strName;
    }

    public void setStrName(String strName) {
        this.strName = strName;
    }

    public String getStrLastName() {
        return strLastName;
    }

    public void setStrLastName(String strLastName) {
        this.strLastName = strLastName;
    }

    public String getStrEmail() {
        return strEmail;
    }

    public void setStrEmail(String strEmail) {
        this.strEmail = strEmail;
    }
}
