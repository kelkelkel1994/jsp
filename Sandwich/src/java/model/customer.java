package model;
public class customer {
    private Long IDcus;
    private String Ten;
    private String User;
    private String Pass;
    private String DT;
    private String Diachi;
    private String Email;
    private Boolean Status;

    public customer(){}

    public customer(Long IDcus, String Ten, String User, String Pass, String DT, String Diachi, String Email, Boolean Status) {
        this.IDcus = IDcus;
        this.Ten = Ten;
        this.User = User;
        this.Pass = Pass;
        this.DT = DT;
        this.Diachi = Diachi;
        this.Email = Email;
        this.Status = Status;
    }

    public Boolean getStatus() {
        return Status;
    }

    public void setStatus(Boolean Status) {
        this.Status = Status;
    }
    
    public Long getIDcus() {
        return IDcus;
    }

    public void setIDcus(Long IDcus) {
        this.IDcus = IDcus;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public String getDT() {
        return DT;
    }

    public void setDT(String DT) {
        this.DT = DT;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    
    
}
